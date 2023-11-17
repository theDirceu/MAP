package br.uepb.edu.domain.comand;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorComandos {
    private List<Comando> comandos = new ArrayList<>();

    public void adicionarComando(Comando comando) {
        comandos.add(comando);
    }

    public void executarComandos() {
        for (Comando comando : comandos) {
            comando.executar();
        }
        comandos.clear();
    }
}
