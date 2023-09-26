package pe.edu.upc.food_hunger_tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.food_hunger_tf.dtos.Usuario_DTO;
import pe.edu.upc.food_hunger_tf.entities.Roles;
import pe.edu.upc.food_hunger_tf.entities.Tipo_alimento;
import pe.edu.upc.food_hunger_tf.entities.Tipo_donacion;
import pe.edu.upc.food_hunger_tf.entities.Usuario;
import pe.edu.upc.food_hunger_tf.repositories.IRoles;
import pe.edu.upc.food_hunger_tf.repositories.ITipo_DonacionRepository;
import pe.edu.upc.food_hunger_tf.repositories.IUsuarioRepository;
import pe.edu.upc.food_hunger_tf.serviceinterfaces.IUsuario_Service;

import javax.management.relation.Role;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class Usuario_Implement implements IUsuario_Service {
    @Autowired
    public IUsuarioRepository iUsuarioRepository;

    @Autowired
    public ITipo_DonacionRepository tp;

    @Autowired
    public IRoles rp;

    public void registrar(Usuario_DTO udto){
        Roles roles = rp.findById(udto.getIdRoles())
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el rol con ID " + udto.getIdRoles()));
        Tipo_donacion tdonacion = tp.findById(udto.getIdTipoDonacion())
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el rol con ID " + udto.getIdTipoDonacion()));

        Usuario usuario = new Usuario();
        usuario.setRoles(roles);
        usuario.setTipoDonacion(tdonacion);

        usuario.setNombreU(udto.getNombreU());
        usuario.setApelidoU(udto.getApelidoU());
        usuario.setDonacionU(udto.getDonacionU());
        iUsuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> list() {return iUsuarioRepository.findAll();}
    @Override
    public void delete(Long idUsuario) {iUsuarioRepository.deleteById(idUsuario);}

    public void modificar(Long id, Usuario_DTO udto){
        Usuario usuarioE = iUsuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el usuario con ID " + id));

        Roles roles = rp.findById(udto.getIdRoles())
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el rol con ID " + udto.getIdRoles()));
        Tipo_donacion tdonacion = tp.findById(udto.getIdTipoDonacion())
                .orElseThrow(() -> new EntityNotFoundException("No se encontró el rol con ID " + udto.getIdTipoDonacion()));
        usuarioE.setRoles(roles);
        usuarioE.setTipoDonacion(tdonacion);

        usuarioE.setNombreU(udto.getNombreU());
        usuarioE.setApelidoU(udto.getApelidoU());
        usuarioE.setDonacionU(udto.getDonacionU());
        iUsuarioRepository.save(usuarioE);
    }
}

