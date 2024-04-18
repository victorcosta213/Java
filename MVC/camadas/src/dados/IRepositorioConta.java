package dados;

import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;

public interface IRepositorioConta {
    public void inserirConta(Conta c);
    public void alterarConta(Conta c);
    public void removerConta(int numero);
    public Conta buscarConta(int numero) throws ContaNaoEncontradaException;
    public boolean verificarExistenciaConta(int numero) throws ContaJaExisteException;
    public Conta[] buscarTodos();
}
