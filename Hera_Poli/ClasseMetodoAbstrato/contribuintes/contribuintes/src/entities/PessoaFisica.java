package entities;

public class PessoaFisica extends Contribuinte{
    private double gastoSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double impostos() {
        double imposto;
        if (getRendaAnual()<20000 && gastoSaude!=0){
            imposto = (getRendaAnual() * 0.15) - (0.5 * gastoSaude);
        }else if (getRendaAnual()>20000 && gastoSaude!=0) {
            imposto = (getRendaAnual() * 0.25) - (0.5 * gastoSaude);
        }else if(getRendaAnual()<20000){
            imposto = (getRendaAnual() * 0.15);
        }else{
            imposto = (getRendaAnual() * 0.25);
        }


        return imposto;
    }


}
