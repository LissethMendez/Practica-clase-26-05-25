public class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Getters
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    // Setters
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja.");
    }

    public void jugarPartido() {
        System.out.println("El futbolista juega el partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena.");
    }
}
