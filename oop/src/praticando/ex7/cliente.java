package praticando.ex7;

public class cliente {

    private int ag;
    private int conta;
    private double saldo=0;

    public void setAg(int ag) {
        this.ag = ag;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getConta() {
        return conta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void addsaldo(double x){
        this.saldo = this.saldo + x;
    }
}
