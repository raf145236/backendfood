package pe.edu.upc.food_hunger_tf.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.food_hunger_tf.dtos.AlimentoDonado_DTO;
import pe.edu.upc.food_hunger_tf.dtos.Usuario_DTO;
import pe.edu.upc.food_hunger_tf.entities.Alimentos_Donados;
import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;

import java.util.List;

public interface IAlimentoDonado_Service {
    public void agregar(AlimentoDonado_DTO alimentoDonadoDto);

    public List<Alimentos_Donados> list();

    public void delete(Long idAlimentoDonado);
    public void modificar(Long id, AlimentoDonado_DTO addto);

    public List<Alimentos_Donados> getByTipoAlimentoAndFechaVencimiento(Integer idTipoAlimento);
}
