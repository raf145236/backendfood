package pe.edu.upc.food_hunger_tf.serviceinterfaces;

import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;
import java.util.List;

public interface ITipo_Donacion_Service {

    public void insert(Tipo_donacion tipo_donacion);

    public List<Tipo_donacion> list();

    public void delete(int id_Tipo_Donacion);
}