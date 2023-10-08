package br.uepb.edu.domain.components;

import br.uepb.edu.domain.Users.User;

public class Cadastrar {
    
    private User user;

    public void setUser(User user){
        this.user = user;
    }

    public void CadastrarLeitor(){
        System.out.println("Leitor cadastrado com sucesso!");
    }

    public void CadastrarLivro(){
        System.out.println("Leitor cadastrado com sucesso!");
    }

}
