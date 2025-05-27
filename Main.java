public class Main {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Juan", "Pérez", 25, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Carlos", "López", 50, "FED123");
        Masajista masajista = new Masajista(3, "Ana", "Martínez", 40, "Fisioterapia", 15);

        futbolista.concentrarse();
        entrenador.viajar();
        masajista.darMasaje();

        System.out.println("Dorsal: " + futbolista.getDorsal());
        System.out.println("ID Federación: " + entrenador.getIdFederacion());
        System.out.println("Titulación: " + masajista.getTitulacion());
    }
}

