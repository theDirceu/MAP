package br.uepb.edu.domain.comand;

public class ExemploBiblioteca {
    public static void main(String[] args) {
        // Criando instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando instâncias dos comandos
        ComandoEmprestimo comandoEmprestimo = new ComandoEmprestimo(biblioteca);
        ComandoDevolucao comandoDevolucao = new ComandoDevolucao(biblioteca);

        // Criando o invocador (gerenciador de comandos)
        GerenciadorComandos gerenciadorComandos = new GerenciadorComandos();

        // Adicionando comandos à lista
        gerenciadorComandos.adicionarComando(comandoEmprestimo);
        gerenciadorComandos.adicionarComando(comandoDevolucao);

        // Executando os comandos
        gerenciadorComandos.executarComandos();
    }
}
