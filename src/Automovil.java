public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    public String leerFabricante()
    {
        return this.fabricante;
    }

    public void asignarFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }

    public  String leerModel()
    {
        return  this.modelo;
    }
    public  void asignarModel(String modelo)
    {
        this.modelo = modelo;
    }
    public  String leerColor()
    {
        return  this.color;
    }
    public void asignarColor(String color)
    {
        this.color = color;

    }
    public Double leerCilindrada()
    {
        return this.cilindrada;
    }
    public void asignarCilindrada(double cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public  int leerCapacidadTanque()
    {
        return this.capacidadTanque;
    }

    public void asignarCapacidadTanque(int capacidadTanque)
    {
        this.capacidadTanque = capacidadTanque;
    }

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
