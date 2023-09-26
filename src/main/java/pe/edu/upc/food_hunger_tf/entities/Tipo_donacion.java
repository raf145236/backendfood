package pe.edu.upc.food_hunger_tf.entities;

import javax.persistence.*;

@Entity
@Table (name = "Tipo_donacion")

//Tipo_donacion son: Donar alimentos o economico(monetario)
//@Table(name = "Tipo_donacion", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "id_TipoDonacion"})})
public class Tipo_donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDonacion;
    @Column(name = "nombreTD", length = 25,nullable = false)
    private String nombreTD;

    //constructor
    public Tipo_donacion() {
    }
    public Tipo_donacion(int idTipoDonacion, String nombreTD) {
        this.idTipoDonacion = idTipoDonacion;
        this.nombreTD = nombreTD;
    }

    //getters and setters

    public int getIdTipoDonacion() {return idTipoDonacion;}

    public void setIdTipoDonacion(int idTipoDonacion) {this.idTipoDonacion = idTipoDonacion;}

    public String getNombreTD() {return nombreTD;}

    public void setNombreTD(String nombreTD) {this.nombreTD = nombreTD;}
}
