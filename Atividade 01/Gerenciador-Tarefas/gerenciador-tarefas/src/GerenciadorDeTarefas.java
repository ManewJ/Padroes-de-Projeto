import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<ITarefa> tarefas;

    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(ITarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada. ");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }
        }
    }
}
