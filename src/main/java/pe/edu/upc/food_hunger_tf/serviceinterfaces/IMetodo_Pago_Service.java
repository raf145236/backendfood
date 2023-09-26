package pe.edu.upc.food_hunger_tf.serviceinterfaces;

import pe.edu.upc.food_hunger_tf.entities.Metodo_Pago;
import java.util.List;

public interface IMetodo_Pago_Service {

    public void insert(Metodo_Pago metodo_Pago);

    public List<Metodo_Pago> list();

    public void delete(int id_Metodo_Pago);
}