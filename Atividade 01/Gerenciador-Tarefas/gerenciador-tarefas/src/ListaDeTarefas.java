import java.util.ArrayList;
import java.util.List;


public class ListaDeTarefas {
    private List<TarefaSimples> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(TarefaSimples tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido. ");
        }
    }

    public List<TarefaSimples> getTarefas() {
        return tarefas;
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        } else {
            System.out.println("Índice inválido. ");
        }
    }
}
