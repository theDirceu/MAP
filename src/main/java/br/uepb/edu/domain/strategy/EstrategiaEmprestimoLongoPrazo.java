package br.uepb.edu.domain.strategy;

public class EstrategiaEmprestimoLongoPrazo implements EstrategiaEmprestimo {
    @Override
    public void realizarEmprestimo() {
        System.out.println("Empréstimo de longo prazo realizado.");
    }
}
