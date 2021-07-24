public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;
    int capacidadTanque = 40;

    public String verDetalle(){
       return  "\n auto.fabricante = " + this.fabricante +
                "\n auto.color = " + this.color +
                "\n auto.modelo = " + this.modelo +
                "\n auto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando " + rpm + "rpm";
    }

    public  String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelararFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + " \n " + frenar;

    }

    public float calcularConsumo(int km, float porcentajeBencina)
    {
        return km/(capacidadTanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina)
    {
        return km/(capacidadTanque*(porcentajeBencina/100f));
    }


}
