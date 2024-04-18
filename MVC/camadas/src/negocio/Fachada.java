package negocio;

import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;

public class Fachada implements IFachada {
    private ControladorContas controladorContas;

    public Fachada() {
        this.controladorContas = new ControladorContas();
    }

    @Override
    public void inserirConta(Conta c) throws ContaJaExisteException {
        controladorContas.inserirConta(c);
    }

    @Override
    public void removerConta(int numero) {
        controladorContas.removerConta(numero);
    }

    @Override
    public void alterarConta(Conta c) {
        controladorContas.alterarConta(c);
    }

    @Override
    public Conta buscarConta(int numero) throws ContaNaoEncontradaException {
        return controladorContas.buscarConta(numero);
    }

    @Override
    public Conta[] buscartodos() {
        return controladorContas.buscarTodos();
    }
}
