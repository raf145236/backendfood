package pe.edu.upc.food_hunger_tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.food_hunger_tf.entities.Tipo_alimento;
import pe.edu.upc.food_hunger_tf.repositories.ITipo_AlimentoRepository;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.ITipo_Alimento_Service;
import java.util.List;

@Service
public class Tipo_Alimento_Implement implements ITipo_Alimento_Service {
    @Autowired
    public ITipo_AlimentoRepository tP;
    @Override
    public void insert(Tipo_alimento tipo_alimento) {tP.save(tipo_alimento);}
    @Override
    public List<Tipo_alimento> list() {return tP.findAll();}
    @Override
    public void delete(int id_Tipo_Alimento) {tP.deleteById(id_Tipo_Alimento);}
}
