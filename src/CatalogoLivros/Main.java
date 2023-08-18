package CatalogoLivros;

import SomaNumeros.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> listLivro = new ArrayList<>();
        CatalogoLivros catalogoLivros = new CatalogoLivros(listLivro);

        catalogoLivros.adicionarLivro("hoobit", "jonatas", 1999);
        catalogoLivros.adicionarLivro("ROmpa", "jonatas", 2001);
        catalogoLivros.adicionarLivro("todinho", "Ronaldo", 2012);
        catalogoLivros.adicionarLivro("Switch", "Gaucho", 2009);
        catalogoLivros.adicionarLivro("Salario", "leandro", 2022);

        System.out.println(catalogoLivros.pesquisarPorAutor("jonatas"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("todinho"));

    }
}
