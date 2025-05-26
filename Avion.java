public class Avion extends Vehiculo{
    private String aerolinea;

    public Avion() {
    }

    public Avion(String marca, String modelo, int anio, String aerolinea) {
        super(marca, modelo, anio);
        this.aerolinea = aerolinea;
    }

    public String getAerolinea() {
        return aerolinea;
    }
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void despegar() {
        System.out.println("El avión está despegando.");
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
