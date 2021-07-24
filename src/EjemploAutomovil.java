public class EjemploAutomovil {

    public static void main(String[] args) {


        Automovil subaru = new Automovil();//se crea el objeto para la instancia de la clase

        subaru.setFabricante("Subaru");
        subaru.setModel("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil();//

        mazda.setFabricante("Mazda");
        mazda.setModel("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");
        System.out.println("Mazda fabricante = " + mazda.getFabricante());

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelararFrenar(4000));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));

    }
}
