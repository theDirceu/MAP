package br.uepb.edu.domain.facade;

import br.uepb.edu.domain.Users.User;

public class Client {
    public static void main(String[] args) {
                User atendente = new User.UserBuilder("José", 1234)
                            .setRole("Atendente")
                            .build();

        User leitor = new User.UserBuilder("Maria", 5678)
                            .setRole("Leitor")
                            .build();

        User bibliotecaria = new User.UserBuilder("Carla", 9012)
                                    .setRole("Bibliotecária")
                                    .setSpecialPermissions("Gestão Completa")
                                    .build();

        EmprestimoCadastroFacade library = new EmprestimoCadastroFacade();

        // O cliente pode emprestar um livro usando apenas uma chamada de método, 
        // sem precisar conhecer todos os subsistemas envolvidos.
        System.out.println(atendente);
        System.out.println(leitor);
        System.out.println(bibliotecaria);        
        library.borrowBook("O Nome do Vento");

    }
}
