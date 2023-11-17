Neste exemplo, Comando é a interface que define o contrato para todos os comandos. As classes concretas ComandoEmprestimo e ComandoDevolucao implementam essa interface, cada uma encapsulando uma ação específica a ser realizada na biblioteca.

A classe GerenciadorComandos atua como o invocador, solicitando a execução de um comando. Isso permite que o cliente configure dinamicamente qual comando deve ser executado.

A classe Biblioteca atua como o receptor, realizando as ações específicas associadas a cada comando.

Ao usar o padrão Command, você desacopla o objeto que emite um pedido do objeto que sabe como executá-lo, proporcionando maior flexibilidade e extensibilidade ao sistema.