package br.uepb.edu.domain.strategy;

public class EstrategiaEmprestimoComum implements EstrategiaEmprestimo {
    @Override
    public void realizarEmprestimo() {
        System.out.println("Empréstimo comum realizado.");
    }
}
