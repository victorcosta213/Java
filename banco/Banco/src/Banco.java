import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
            this.contas.add(conta);
    }





    public Conta buscarContaPorNumero(String numeroConta) throws ContaNaoEncontradaException {
        for (int i = 0; i < this.contas.size(); i++) {
            if (this.contas.get(i).getNumero().equals(numeroConta)) {
                return this.contas.get(i);
            }
        }

        throw new ContaNaoEncontradaException("Conta não encontrada!");
    }

    public Conta buscarConta (Conta C) throws ContaNaoEncontradaException{
        for (int i = 0; i < this.contas.size(); i++) {
            if (this.contas.get(i).getTitular().equals(C.getTitular())) {
                return this.contas.get(i);
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada!");
    }
}
