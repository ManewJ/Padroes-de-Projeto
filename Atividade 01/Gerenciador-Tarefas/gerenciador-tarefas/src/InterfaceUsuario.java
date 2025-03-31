import java.util.Scanner;

class InterfaceUsuario {
    private ListaDeTarefas listaDeTarefas;
    private ManipuladorDeTarefa manipuladorDeTarefa;
    private Scanner scanner;

    public InterfaceUsuario(ListaDeTarefas listaDeTarefas, ManipuladorDeTarefa manipuladorDeTarefa) {
        this.listaDeTarefas = listaDeTarefas;
        this.manipuladorDeTarefa = manipuladorDeTarefa;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Listar tarefas.");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarTarefa();
                        break;
                    case 2:
                        removerTarefa();
                        break;
                    case 3:
                        marcarTarefaComoConcluida();
                        break;
                    case 4:
                        listarTarefas();
                        break;
                    case 0:
                        System.out.println("Saindo... ");
                        break;
                    default:
                        System.out.println("Opção inválida. ");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido. ");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);
        scanner.close();
    }

    private void adicionarTarefa() {
        System.out.println("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        manipuladorDeTarefa.adicionarTarefa(new Tarefa(descricao));
    }

    private void removerTarefa() {
        System.out.println("Digite o índice da tarefa a ser removida: ");
        int indiceRemover = scanner.nextInt();
        manipuladorDeTarefa.removerTarefa(indiceRemover);
    }

    private void marcarTarefaComoConcluida() {
        System.out.println("Digite o índice da tarefa a ser marcada como concluída: ");
        int indiceConcluir = scanner.nextInt();
        manipuladorDeTarefa.marcarTarefaComoConcluida(indiceConcluir);
    }

    private void listarTarefas() {
        manipuladorDeTarefa.listarTarefas();
    }
}