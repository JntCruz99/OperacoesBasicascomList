package ListaDeTarefas;

public class Tarefa implements Comparable<Tarefa>{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int compareTo(Tarefa outraTarefa) {
        return this.descricao.compareTo(outraTarefa.descricao);
    }
}
