package pe.edu.upc.food_hunger_tf.dtos;

import lombok.Data;



@Data
public class Usuario_DTO {

    private Long idU;

    private String NombreU;

    private String ApelidoU;

    private String DonacionU;

    private  int idTipoDonacion;

    private Long idRoles;
}
