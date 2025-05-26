package Interface;

public class Main {
    public static void main(String[] args) {
        Maestro maestro = new Maestro("Juan", 40);
        System.out.println("Nombre: " + maestro.getNombre());
        maestro.setHorasTrabajadas(15);
        System.out.println("Horas trabajadas: " + maestro.getHorasTrabajadas());
        System.out.println("Sueldo: " + maestro.calcularSueldo());
    }
    
    
}
