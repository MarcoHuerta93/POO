public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;

    public String getFabricante()
    {
        return this.fabricante;
    }

    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }

    public  String getModel()
    {
        return  this.modelo;
    }
    public  void setModel(String modelo)
    {
        this.modelo = modelo;
    }
    public  String getColor()
    {
        return  this.color;
    }
    public void setColor(String color)
    {
        this.color = color;

    }
    public Double getCilindrada()
    {
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada)
    {
        this.cilindrada = cilindrada;
    }

    public  int getCapacidadTanque()
    {
        return this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque)
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
