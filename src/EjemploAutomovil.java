public class EjemploAutomovil {

    public static void main(String[] args) {


        Automovil subaru = new Automovil();//se crea el objeto para la instancia de la clase

        subaru.asignarFabricante("Subaru");
        subaru.asignarModel("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        Automovil mazda = new Automovil();//

        mazda.asignarFabricante("Mazda");
        mazda.asignarModel("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");
        System.out.println("Mazda fabricante = " + mazda.leerFabricante());

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelararFrenar(4000));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));

    }
}
