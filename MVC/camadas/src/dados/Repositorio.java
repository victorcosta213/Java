package dados;

import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;

import java.util.ArrayList;
import java.util.Scanner;

public class Repositorio implements IRepositorioConta{
    Scanner sc = new Scanner(System.in);
    private  ArrayList<Conta> contas;

    public Repositorio() {
        this.contas = new ArrayList<>();
    }

    @Override
    public boolean verificarExistenciaConta (int numero) throws ContaJaExisteException {
        for(Conta i: contas){
            if (i.getNumero()==numero){
                throw new ContaJaExisteException("Conta com a numereção ("+numero+") já existe!");
            }
        }
        return false;
    }

    @Override
    public void inserirConta(Conta c) {
        contas.add(c);
        System.out.println("Conta adicionada com sucesso!");
    }

    @Override
    public void removerConta (int numero) {
        for (Conta i: contas){
            if (i.getNumero()==numero){
                contas.remove(i);
            }
        }
    }

    @Override
    public Conta buscarConta(int numero) throws ContaNaoEncontradaException {
        for (Conta conta:contas) {
            if (conta.getNumero()==numero){
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("A conta com a numereção ("+numero+") não existe!");
    }

    @Override
    public void alterarConta(Conta c) {
        for (Conta i: contas){
            if (i.equals(c.getNumero())){
                System.out.print("Digite o Numero da conta: ");
                i.setNumero(sc.nextInt());
                sc.nextLine();
                System.out.print("Digite o nome do titular: ");
                i.setTitular(sc.nextLine());

            }
        }
    }

    @Override
    public Conta[] buscarTodos() {
        Conta[] contas1 = contas.toArray(new Conta[contas.size()]);
        return contas1;
    }
}
