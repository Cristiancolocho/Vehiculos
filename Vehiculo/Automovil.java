package Vehiculo;
public class Automovil extends Vehiculo{
    private int Precio;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anio, int precio) {
        super(marca, modelo, anio);
        Precio = precio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public void mantenimiento() {
        System.out.println("El mantenimiento del automovil es cada 6 meses.");
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
