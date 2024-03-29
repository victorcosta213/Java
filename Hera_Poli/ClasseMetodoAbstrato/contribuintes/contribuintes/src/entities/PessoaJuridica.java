package entities;

public class PessoaJuridica extends Contribuinte {
    private int numerofuncionario;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaAnual, int numerofuncionario) {
        super(nome, rendaAnual);
        this.numerofuncionario = numerofuncionario;
    }

    public int getNumerofuncionario() {
        return numerofuncionario;
    }

    public void setNumerofuncionario(int numerofuncionario) {
        this.numerofuncionario = numerofuncionario;
    }

    @Override
    public double impostos() {
       double imposto;
       if (numerofuncionario>10){
           imposto = getRendaAnual() * 0.14;
       }else{
           imposto = getRendaAnual() * 0.16;
       }

       return imposto;
    }
}
