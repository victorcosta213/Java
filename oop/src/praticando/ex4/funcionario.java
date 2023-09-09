package praticando.ex4;

public class funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
       return salarioBruto - imposto;
    }

    public void Acrescimo(double porcent){
       this.salarioBruto= (this.salarioBruto * porcent)/100;

    }

    public String toString(){
        return nome+", R$"+salarioLiquido();
    }

}
