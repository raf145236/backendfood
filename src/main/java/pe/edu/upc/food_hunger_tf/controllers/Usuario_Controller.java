package pe.edu.upc.food_hunger_tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.food_hunger_tf.dtos.Usuario_DTO;
import pe.edu.upc.food_hunger_tf.entities.Alimentos_Donados;
import pe.edu.upc.food_hunger_tf.entities.Usuario;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.IUsuario_Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuario")
public class Usuario_Controller {
    @Autowired
    private IUsuario_Service IUsuario_Service;

    @PostMapping("/Registrar")
    public void registrar(@RequestBody Usuario_DTO usuario_dto){
      IUsuario_Service.registrar(usuario_dto);
    }

    @GetMapping("/Listar")
    public ResponseEntity<List<Usuario>> listar(){
        return new ResponseEntity<>(IUsuario_Service.list(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){IUsuario_Service.delete(id);}

    @PutMapping("/{id}")
    public void modificar(@PathVariable("id") Long id,@RequestBody Usuario_DTO usuario_dto){
    IUsuario_Service.modificar(id,usuario_dto);
    }
}
