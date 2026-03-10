public class Bus {
    private int capacidad;
    private int pasajeros;
    private double costoPasaje;

    public Bus(int capacidad, int pasajeros, double costoPasaje) {
        this.capacidad = capacidad;
        this.pasajeros = pasajeros;
        this.costoPasaje = costoPasaje;
    }

    // a) Subir pasajeros
    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros += cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros. Total ahora: " + pasajeros);
        } else {
            System.out.println("No hay suficientes asientos. Solo pueden subir " 
                               + (capacidad - pasajeros) + " pasajeros.");
        }
    }

    // b) Cobrar pasaje
    public double cobrarPasaje() {
        double total = pasajeros * costoPasaje;
        System.out.println("Se cobro un total de Bs. " + total);
        return total;
    }

    // c) Asientos disponibles
    public int asientosDisponibles() {
        int disponibles = capacidad - pasajeros;
        System.out.println("Quedan " + disponibles + " asientos disponibles.");
        return disponibles;
    }

    // d) Instancia y uso de métodos
    public static void main(String[] args) {
        Bus miBus = new Bus(40, 10, 1.50); // inicia con 10 pasajeros

        miBus.subirPasajeros(20);
        miBus.cobrarPasaje();
        miBus.asientosDisponibles();

        miBus.subirPasajeros(15);
        miBus.cobrarPasaje();
        miBus.asientosDisponibles();
    }
}
