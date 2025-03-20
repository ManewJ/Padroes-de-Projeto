
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
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
                scanner.nextLine();  //Aqui vai acontecer uma quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        gerenciador.adicionarTarefa(new Tarefa(descricao));
                        break;

                    case 2:
                        System.out.println("Digite o índice da tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        gerenciador.removerTarefa(indiceRemover);
                        break;

                    case 3:
                        System.out.println("Digite o índice da tarefa a ser marcada como concluída: ");
                        int indiceConcluir = scanner.nextInt();
                        gerenciador.marcarTarefaComoConcluida(indiceConcluir);
                        break;

                    case 4:
                        gerenciador.listarTarefas();
                        break;

                    case 0:
                        System.out.println("Saindo... ");
                        break;

                    default:
                        System.out.println("Opção inválida. ");

                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro válido. ");
                scanner.nextLine(); // aqui vamos limpar o scanner
                opcao = -1; //aqui continuamos o loop

            }

        } while (opcao != 0);

        scanner.close();
    }
}


