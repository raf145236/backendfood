package pe.edu.upc.food_hunger_tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.food_hunger_tf.dtos.Tipo_Alimento_DTO;
import pe.edu.upc.food_hunger_tf.dtos.Tipo_Donacion_DTO;
import pe.edu.upc.food_hunger_tf.entities.Tipo_alimento;
import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.ITipo_Donacion_Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoDonacion")
public class Tipo_Donacion_Controller {
    @Autowired
    private ITipo_Donacion_Service tdS;

    @PostMapping("/Registrar")
    public void registrar(@RequestBody Tipo_Donacion_DTO dto) {
        ModelMapper m = new ModelMapper();
        Tipo_donacion u = m.map(dto, Tipo_donacion.class);
        tdS.insert(u);
    }
    @GetMapping("/Lista")
    public List<Tipo_Donacion_DTO> listar() {
        return tdS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Tipo_Donacion_DTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tdS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Tipo_Donacion_DTO dto) {
        ModelMapper m = new ModelMapper();
        Tipo_donacion u = m.map(dto, Tipo_donacion.class);
        tdS.insert(u);
    }
}
