package pe.edu.upc.food_hunger_tf.dtos;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;
@Data
public class AlimentoDonado_DTO {
    private Long idAlimentos_Donados;

    private String Nombre_alimento;

    private String Descripcion_especifico;

    private LocalDate FechaEmision;

    private LocalDate FechaVencimiento;

    private int id_TipoAlimento;

}
