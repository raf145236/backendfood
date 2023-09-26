package pe.edu.upc.food_hunger_tf.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Alimentos_donados_por_Donante_DTO {
    private Long idAlimentosDonadosPorDonante;
    private Long idAlimentos_Donados;
    private Long idU;
    private LocalDate fechaDonacion;
    private int cantidadAlimentos;
}
