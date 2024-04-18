package negocio;

import dados.IRepositorioConta;
import dados.Repositorio;
import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;

public class ControladorContas {
    private IRepositorioConta repContas;

    public ControladorContas() {
        this.repContas = new Repositorio();
    }

    public boolean verificarExistenciaConta(int numero) throws ContaJaExisteException {
      return repContas.verificarExistenciaConta(numero);
    }

    public void inserirConta(Conta c) throws ContaJaExisteException {
        if (repContas.verificarExistenciaConta(c.getNumero())){
            System.out.println("Essa costa já existe, crie uma conta com outro número!");
        }else{
            repContas.inserirConta(c);
        }
    }

    public void removerConta(int numero) {
      repContas.removerConta(numero);
    }


    public Conta buscarConta(int numero) throws ContaNaoEncontradaException {
      return repContas.buscarConta(numero);
    }

    public void alterarConta(Conta c) {
        repContas.alterarConta(c);
    }


    public Conta[] buscarTodos() {
        return repContas.buscarTodos();
    }
}



