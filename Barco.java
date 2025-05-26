public class Barco extends Vehiculo {
    private int capacidadPasajeros;

    public Barco() {
    }

    public Barco(String marca, String modelo, int anio, int capacidadPasajeros) {
        super(marca, modelo, anio);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void subirPasajeros(){
        System.out.println("Subiendo pasajeros al barco.");
    }

    @Override
    public void color() {
        super.color();
    }

    @Override
    public void estado() {
        super.estado();
    }
    
}
