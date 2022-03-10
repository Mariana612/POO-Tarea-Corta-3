public class Circulo extends Figura{
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }

    public int returnSides(){
        return 1;
    }
}

