public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Automovil
        Automovil auto = new Automovil("Toyota", "Corolla", 2020, 20000);
        auto.color();
        auto.estado();
        auto.mantenimiento();
        imprimir(auto);
        System.out.println("Precio del automovil: " + auto.getPrecio());

        // Crear un objeto de tipo Avion
        Avion avion = new Avion("Boeing", "747", 2019, "Aerolínea X");
        avion.color();
        avion.estado();
        avion.despegar();
        imprimir(avion);
        System.out.println("Aerolinea del avión: " + avion.getAerolinea());

        // Crear un objeto de tipo Barco
        Barco barco = new Barco("Yamaha", "242X", 2021, 12);
        barco.color();
        barco.estado();
        barco.subirPasajeros();
        imprimir(barco);
        System.out.println("Capacidad del barco: " + barco.getCapacidadPasajeros());
    }

    public static void imprimir(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Año: " + vehiculo.getAnio());
    }
}
