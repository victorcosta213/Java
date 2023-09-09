package praticando.ex6;

public class Banco {
    private int agencia;
    private String nome;
    private double deposito;

    public Banco(int agencia, String nome){
        this.agencia= agencia;
        this.nome=nome;
    }

    public Banco(int agencia, String nome, double inicialDeposito){
        this.agencia= agencia;
        this.nome=nome;
        deposito(inicialDeposito);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public double getDeposito() {
        return deposito;
    }

    public void deposito(double deposito){
        this.deposito= this.deposito +deposito;
    }

    public void saque(double saque){
        this.deposito= this.deposito-(saque+5);
    }

}
