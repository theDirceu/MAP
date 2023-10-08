package br.uepb.edu.domain.facade;

class Lending {
    public boolean lendBook(String bookDetails) {
        // Processo de empréstimo do livro.
        System.out.println("Livro: " + bookDetails + " foi emprestado.");
        return true;
    }
}
