package br.uepb.edu.domain.comand;

// Comando para devolução de livro
public class ComandoDevolucao implements Comando {
    private Biblioteca biblioteca;

    public ComandoDevolucao(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar() {
        biblioteca.realizarDevolucao();
    }
}
