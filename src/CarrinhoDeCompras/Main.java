package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(itens);

        carrinhoDeCompras.adicionarItem("livro",2.50,2);
        carrinhoDeCompras.adicionarItem("mouse",2.50,1);

        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println("TOTAL: R$ " + carrinhoDeCompras.calcularValorTotal());

    }
}
