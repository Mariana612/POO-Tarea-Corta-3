public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public int returnSides(){
        return 3;
    }
}
