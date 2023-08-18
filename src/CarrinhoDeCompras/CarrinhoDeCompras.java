package CarrinhoDeCompras;

import ListaDeTarefas.Tarefa;

import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras(List<Item> itens) {
        this.itens = itens;
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome){
        for (Item item: itens){
            if (item.getNome().equals(nome)){
                itens.remove(item);
            }
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item: itens){
            total+= (item.getPreco() * item.getQuantidade());
        }
        return total;
    }

    public String exibirItens(){
        String itensExi = "";
        Collections.sort(itens);
        for (Item item : itens){
            itensExi+= "\n" + item.toString();
        }
        return itensExi;
    }


}
