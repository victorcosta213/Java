package entities;

import java.util.Date;

public class Locadora {
    private String name;
    private Date retirada;
    private Date retorno;
    private double precoHora;
    private double precoDia;

    public Locadora(String name, Date retirada, Date retorno, double precoHora, double precoDia) {
        this.name = name;
        this.retirada = retirada;
        this.retorno = retorno;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

    public void Fatura(){
        
    }
}
