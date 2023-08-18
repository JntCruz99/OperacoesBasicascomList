package ListaDeTarefas;

import ListaDeTarefas.ListaTarefas;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Fazer o almoço");
        listaTarefas.adicionarTarefa("vai ser excluido");
        listaTarefas.adicionarTarefa("Arma tantantam");

        listaTarefas.removerTarefa("vai ser excluido");
        Collections.sort(listaTarefas.getTarefas());

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());

    }
}