package pe.edu.upc.food_hunger_tf.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "Usuario")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idU", nullable = false)
    private Long idU;

    @Column(name = "NombreU", length = 30,nullable = false)
    private String NombreU;
    @Column(name = "ApellidoU", length = 30,nullable = false)
    private String ApelidoU;
    @Column(name = "DonacionU", length = 40,nullable = false)
    private String DonacionU;


    @JoinColumn(name = "id_Roles")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Roles roles;

    @JoinColumn(name = "idTipoDonacion")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Tipo_donacion tipoDonacion;

}
