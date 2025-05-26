package Abstracta;

public abstract class Personal {
    private String nombre;
    private int edad;

    public Personal() {
    }

    public Personal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public  void Registrar() {
    System.out.println("Registrando Personal");
    }
    public  void calcularSueldo() {
    System.out.println("Calculando Sueldo");
}

}
