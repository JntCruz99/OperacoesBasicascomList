package ListaDeTarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefas;


    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);
        if (getTarefas() == null){
            List<Tarefa> tarefaList = new ArrayList<>();
            tarefaList.add(tarefa);
            this.tarefas = tarefaList;
        }else {
            List<Tarefa> tarefaList = new ArrayList<>();
            for (Tarefa tarefa1: getTarefas()){
                tarefaList.add(tarefa1);
            }
            tarefaList.add(tarefa);
            this.tarefas = tarefaList;

        }



    }

    public void removerTarefa(String descricao){
        for (Tarefa tarefa : tarefas){
            if (tarefa.getDescricao().equals(descricao)){
                tarefas.remove(tarefa);
            }
        }
    }

    public int obterNumeroTotalTarefas(){
        int numeroTotal = tarefas.size();
        return numeroTotal;
    }

    public List<String> obterDescricoesTarefas(){
        List<String> listaTartefas = new ArrayList<>();

        for (Tarefa tarefa : tarefas){
            listaTartefas.add(tarefa.getDescricao());
        }
        return listaTartefas;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {

    }
}
