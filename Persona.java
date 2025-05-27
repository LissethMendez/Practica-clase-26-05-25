public abstract class Persona {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public abstract void concentrarse();
    public abstract void viajar();
}


