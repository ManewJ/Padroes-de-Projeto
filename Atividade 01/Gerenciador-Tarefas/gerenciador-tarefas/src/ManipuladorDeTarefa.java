import java.util.List;

public class ManipuladorDeTarefa {
    private ListaDeTarefas listaDeTarefas;

    public ManipuladorDeTarefa(ListaDeTarefas listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    public void adicionarTarefa(TarefaSimples tarefa) {
        listaDeTarefas.adicionarTarefa(tarefa);
    }

    public void removerTarefa(int indice) {
        listaDeTarefas.removerTarefa(indice);
    }

    public void marcarTarefaComoConcluida(int indice) {
        listaDeTarefas.marcarTarefaComoConcluida(indice);

    }

    public void listarTarefas() {
        List<TarefaSimples> tarefas = listaDeTarefas.getTarefas();
        System.out.println("Tamanho da lista de tarefas: " + tarefas.size());
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa foi cadastrada. ");
        } else {
            for (int i = 0; i <tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }

        }
    }
    public void adicionarTarefa(Tarefa tarefa) {
        listaDeTarefas.adicionarTarefa(tarefa);
    }
}
