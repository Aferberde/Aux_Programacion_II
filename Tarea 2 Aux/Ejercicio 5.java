import java.util.ArrayList;

public class ServidorMinecraft {
    // Clase interna Jugador
    static class Jugador {
        private String nombre;
        private int diamantes;

        public Jugador(String nombre, int diamantes) {
            this.nombre = nombre;
            this.diamantes = diamantes;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDiamantes() {
            return diamantes;
        }

        public int getStacks() {
            return diamantes / 64;
        }
    }

    private ArrayList<Jugador> jugadores;

    public ServidorMinecraft() {
        jugadores = new ArrayList<>();
    }

    // a) Agregar jugador
    public void agregarJugador(String nombre, int diamantes) {
        if (jugadores.size() < 10) {
            jugadores.add(new Jugador(nombre, diamantes));
            System.out.println("Jugador " + nombre + " agregado con " + diamantes + " diamantes.");
        } else {
            System.out.println("No se pueden agregar más jugadores. Límite alcanzado.");
        }
    }

    // b) Verificar stacks de diamantes
    public void verificarStacks() {
        for (Jugador j : jugadores) {
            System.out.println("Jugador " + j.getNombre() + " tiene " + j.getStacks() + " stack(s).");
        }
    }

    // c) Mostrar jugador con más diamantes
    public void jugadorConMasDiamantes() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en el servidor.");
            return;
        }
        Jugador max = jugadores.get(0);
        for (Jugador j : jugadores) {
            if (j.getDiamantes() > max.getDiamantes()) {
                max = j;
            }
        }
        System.out.println("El jugador con más diamantes es " + max.getNombre() + " con " + max.getDiamantes() + " diamantes.");
    }

    // d) Total de diamantes
    public void totalDiamantes() {
        int total = 0;
        for (Jugador j : jugadores) {
            total += j.getDiamantes();
        }
        System.out.println("El total de diamantes en el servidor es: " + total);
    }

    public static void main(String[] args) {
        ServidorMinecraft servidor = new ServidorMinecraft();

        servidor.agregarJugador("Molly", 120);
        servidor.agregarJugador("Maurice", 65);
        servidor.agregarJugador("Malu", 200);

        servidor.verificarStacks();
        servidor.jugadorConMasDiamantes();
        servidor.totalDiamantes();
    }
}
