public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n auto.fabricante = " + this.fabricante);
        sb.append("\n auto.color = " + this.color);
        sb.append("\n auto.modelo = " + this.modelo);
        sb.append("\n auto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }
}
