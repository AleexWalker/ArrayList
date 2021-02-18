import java.io.Serializable;

public class ClasePokemon implements Serializable, Comparable {
    private String nombre;
    private String tipo;
    private int generacion;
    private int velocidad;

    public ClasePokemon(String nombre, String tipo, int generacion, int velocidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.generacion = generacion;
        this.velocidad = velocidad;
    }
    public ClasePokemon() {
        this.nombre = nombre;
        this.tipo = tipo;
        this.generacion = generacion;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "ClasePokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", generacion=" + generacion +
                ", velocidad=" + velocidad +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
