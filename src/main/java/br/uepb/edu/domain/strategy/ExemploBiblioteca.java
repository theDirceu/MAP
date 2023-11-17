package br.uepb.edu.domain.strategy;

public class ExemploBiblioteca {
    public static void main(String[] args) {
        // Criando instâncias das estratégias de empréstimo
        EstrategiaEmprestimoComum comum = new EstrategiaEmprestimoComum();
        EstrategiaEmprestimoPrioritario prioritario = new EstrategiaEmprestimoPrioritario();
        EstrategiaEmprestimoLongoPrazo longoPrazo = new EstrategiaEmprestimoLongoPrazo();

        // Criando a biblioteca com uma estratégia inicial
        Biblioteca biblioteca = new Biblioteca(comum);

        // Realizando empréstimos com a estratégia atual
        biblioteca.realizarEmprestimo();

        // Mudando a estratégia para empréstimo prioritário
        biblioteca.setEstrategiaEmprestimo(prioritario);

        // Realizando empréstimo com a nova estratégia
        biblioteca.realizarEmprestimo();

        // Mudando a estratégia para empréstimo de longo prazo
        biblioteca.setEstrategiaEmprestimo(longoPrazo);

        // Realizando empréstimo com a nova estratégia
        biblioteca.realizarEmprestimo();
    }
}
