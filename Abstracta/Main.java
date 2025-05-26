package Abstracta;

public class Main {

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan", 30, "9:00 - 17:00");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Horario: " + trabajador.getHorario());
        
        trabajador.Registrar();
        trabajador.calcularSueldo();
        trabajador.Trabajar();
    }
    
}
