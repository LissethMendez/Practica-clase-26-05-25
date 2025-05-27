public class Masajista extends Persona {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Getter para titulacion
    public String getTitulacion() {
        return titulacion;
    }

    // Setter para titulacion
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    // Getter para años de experiencia
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // Setter para años de experiencia
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja.");
    }

    public void darMasaje() {
        System.out.println("El masajista da un masaje.");
    }
}



