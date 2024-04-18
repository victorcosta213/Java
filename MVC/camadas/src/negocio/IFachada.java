package negocio;

import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;

public interface IFachada {

    public void inserirConta(Conta c) throws ContaJaExisteException;
    public void alterarConta(Conta c);
    public void removerConta(int numero);
    public Conta buscarConta(int numero) throws ContaNaoEncontradaException;
    public Conta[] buscartodos();
}
