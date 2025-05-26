package Interface;

public class Maestro implements IProfesion {
    private String nombre;
    private int horasTrabajadas;
    
    public Maestro() {
    }

    public Maestro(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * 20.0; // Suponiendo que cada hora trabajada paga 20 unidades monetarias
    }
    
}
