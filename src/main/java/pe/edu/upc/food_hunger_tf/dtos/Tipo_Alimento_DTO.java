package pe.edu.upc.food_hunger_tf.dtos;

public class Tipo_Alimento_DTO {
    private int id_TipoAlimento;

    private String nombre_TA;

    private String Descripcion_general;

    //getters and setters
    public int getId_TipoAlimento() {
        return id_TipoAlimento;
    }

    public void setId_TipoAlimento(int id_TipoAlimento) {
        this.id_TipoAlimento = id_TipoAlimento;
    }

    public String getNombre_TA() {
        return nombre_TA;
    }

    public void setNombre_TA(String nombre_TA) {
        this.nombre_TA = nombre_TA;
    }

    public String getDescripcion_general() {
        return Descripcion_general;
    }

    public void setDescripcion_general(String descripcion_general) {
        Descripcion_general = descripcion_general;
    }
}
