package pe.edu.upc.food_hunger_tf.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Tipo_alimento")
public class Tipo_alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_TipoAlimento;
    @Column(name = "nombre_TA", length = 25,nullable = false)
    private String nombre_TA;
    @Column(name = "Descripcion_general",length = 50, nullable = false)
    private String Descripcion_general;

    //constructor
    public Tipo_alimento() {
    }
    public Tipo_alimento(int id_TipoAlimento, String nombre_TA, String descripcion_general) {
        this.id_TipoAlimento = id_TipoAlimento;
        this.nombre_TA = nombre_TA;
        Descripcion_general = descripcion_general;
    }

    //getters and setters
    public int getId_TipoAlimento() {return id_TipoAlimento;}

    public void setId_TipoAlimento(int id_TipoAlimento) {this.id_TipoAlimento = id_TipoAlimento;}

    public String getNombre_TA() {return nombre_TA;}

    public void setNombre_TA(String nombre_TA) {this.nombre_TA = nombre_TA;}

    public String getDescripcion_general() {return Descripcion_general;}

    public void setDescripcion_general(String descripcion_general) {Descripcion_general = descripcion_general;}
}
