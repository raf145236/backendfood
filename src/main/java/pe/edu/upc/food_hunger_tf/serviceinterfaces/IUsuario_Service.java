package pe.edu.upc.food_hunger_tf.serviceinterfaces;

import pe.edu.upc.food_hunger_tf.dtos.Usuario_DTO;
import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;
import pe.edu.upc.food_hunger_tf.entities.Usuario;

import java.util.List;

public interface IUsuario_Service {
    public void registrar(Usuario_DTO udto);

    public List<Usuario> list();

    public void delete(Long idUsuario);

    public void modificar(Long id, Usuario_DTO usdto);
}
