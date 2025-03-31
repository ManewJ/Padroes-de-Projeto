
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        ManipuladorDeTarefa manipuladorDeTarefa = new ManipuladorDeTarefa(listaDeTarefas);
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(listaDeTarefas, manipuladorDeTarefa);
        interfaceUsuario.exibirMenu();
            }
    }
