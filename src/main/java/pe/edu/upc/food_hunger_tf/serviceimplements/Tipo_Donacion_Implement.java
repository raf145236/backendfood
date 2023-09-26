package pe.edu.upc.food_hunger_tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;
import pe.edu.upc.food_hunger_tf.repositories.ITipo_DonacionRepository;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.ITipo_Donacion_Service;

import java.util.List;

@Service
public class Tipo_Donacion_Implement implements ITipo_Donacion_Service {
    @Autowired
    public ITipo_DonacionRepository tdP;
    @Override
    public void insert(Tipo_donacion tipo_donacion) {tdP.save(tipo_donacion);}
    @Override
    public List<Tipo_donacion> list() {return tdP.findAll();}
    @Override
    public void delete(int id_Tipo_Donacion) {tdP.deleteById(id_Tipo_Donacion);}
}
