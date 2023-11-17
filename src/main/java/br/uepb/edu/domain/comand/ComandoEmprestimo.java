package br.uepb.edu.domain.comand;

public class ComandoEmprestimo implements Comando {
    private Biblioteca biblioteca;

    public ComandoEmprestimo(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void executar() {
        biblioteca.realizarEmprestimo();
    }
}