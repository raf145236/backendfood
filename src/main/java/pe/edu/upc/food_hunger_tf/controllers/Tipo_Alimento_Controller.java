package pe.edu.upc.food_hunger_tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.food_hunger_tf.dtos.Tipo_Alimento_DTO;
import pe.edu.upc.food_hunger_tf.entities.Tipo_alimento;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.ITipo_Alimento_Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoAlimento")
public class Tipo_Alimento_Controller {
    @Autowired
    private ITipo_Alimento_Service taS;

    @PostMapping("/Registrar")
    public void registrar(@RequestBody Tipo_Alimento_DTO dto) {
        ModelMapper m = new ModelMapper();
        Tipo_alimento u = m.map(dto, Tipo_alimento.class);
        taS.insert(u);
    }
    @GetMapping("/Lista")
    public List<Tipo_Alimento_DTO> listar() {
        return taS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, Tipo_Alimento_DTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        taS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Tipo_Alimento_DTO dto) {
        ModelMapper m = new ModelMapper();
        Tipo_alimento u = m.map(dto, Tipo_alimento.class);
        taS.insert(u);
    }
}
