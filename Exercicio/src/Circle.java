public class Circle {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area(){
        return Math.PI * this.raio;
    }

    public double perimetro(){
        return 2 * Math.PI * this.raio;
    }
}
