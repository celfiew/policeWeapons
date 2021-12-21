public class Policia {
    private String nombre;
    private String apellido;
    private String legajo;

    public Policia(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    // Agrego un toSting solo como parte adicional del proyecto para jugar un poco en el main:

    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
