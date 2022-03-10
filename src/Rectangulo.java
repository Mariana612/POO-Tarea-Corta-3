//figura es bastract porque tiene al menos un m t o d o abstracto
public class Rectangulo extends Figura implements Comparable<Rectangulo> {

    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura) {
        base = pBase;
        altura = pAltura;
    }

    //implementacion del metodo abstracto
    public double calcularArea() {
        return base * altura;
    }

    public int returnSides() {
        return 4;
    }

    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea==areaPorComparar){
            if(this.returnSides() == rectPorComparar.returnSides()){
                System.out.println("tiene los mismos lados");
            }else{System.out.println(" no tiene los mismos lados");}
            return 0;
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}
