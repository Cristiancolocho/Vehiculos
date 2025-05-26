package Abstracta;

public class Trabajador extends Personal {
    private String horario;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, String horario) {
        super(nombre, edad);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void Trabajar() {
        System.out.println("Trabajando");
    }

    @Override
    public void Registrar() {
        System.out.println("Registrando Trabajador");
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Calculando Sueldo del Trabajador");
    }

}
