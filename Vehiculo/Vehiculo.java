package Vehiculo;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

   public void color() {
        System.out.println("El color del vehículo es azul.");
    }

    public void estado() {
        System.out.println("El estado del vehículo es buena.");
    }
   
}