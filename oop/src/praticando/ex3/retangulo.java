package praticando.ex3;

public class retangulo {

    public double comprimento;
    public double altura;

    public double area(){
        return this.altura* this.comprimento;
    }
    public double perimetro(){
        return ( 2 * this.altura) + (2 * this.comprimento);
    }
    public double diagonal(){
        double d= Math.sqrt((Math.pow(comprimento,2)) + (Math.pow(altura,2)));
        return d;
    }

    public String toString() {
        return "Area:"+ area() +", perimetro:"+ perimetro()+", Diagonal:"+String.format("%.2f",diagonal());
    }
}
