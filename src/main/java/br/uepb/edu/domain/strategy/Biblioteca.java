package br.uepb.edu.domain.strategy;

public class Biblioteca {
    private EstrategiaEmprestimo estrategiaEmprestimo;

    public Biblioteca(EstrategiaEmprestimo estrategiaEmprestimo) {
        this.estrategiaEmprestimo = estrategiaEmprestimo;
    }

    public void setEstrategiaEmprestimo(EstrategiaEmprestimo estrategiaEmprestimo) {
        this.estrategiaEmprestimo = estrategiaEmprestimo;
    }

    public void realizarEmprestimo() {
        estrategiaEmprestimo.realizarEmprestimo();
    }
}
