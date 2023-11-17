package br.uepb.edu.domain.strategy;

public class EstrategiaEmprestimoPrioritario implements EstrategiaEmprestimo {
    @Override
    public void realizarEmprestimo() {
        System.out.println("Empréstimo prioritário realizado.");
    }
}
