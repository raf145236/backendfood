package pe.edu.upc.food_hunger_tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.food_hunger_tf.entities.Metodo_Pago;
import pe.edu.upc.food_hunger_tf.repositories.IMetodo_PagoRepository;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.IMetodo_Pago_Service;

import java.util.List;

@Service
public class Metodo_Pago_Implement implements IMetodo_Pago_Service {
    @Autowired
    public IMetodo_PagoRepository mR;
    @Override
    public void insert(Metodo_Pago metodo_Pago) {
        mR.save(metodo_Pago);
    }
    @Override
    public List<Metodo_Pago> list() {
        return mR.findAll();
    }
    @Override
    public void delete(int id_Metodo_Pago) {
        mR.deleteById(id_Metodo_Pago);
    }

}
