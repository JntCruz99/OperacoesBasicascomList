package CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroList = new ArrayList<>();
        for (Livro livro: livros){
            if (livro.getAutor().equals(autor)){
                livroList.add(livro);
            }
        }
        return livroList;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroList = new ArrayList<>();
        for (Livro livro: livros){
            if (livro.getAnoDePublicacao()>= anoInicial && livro.getAnoDePublicacao()<= anoFinal){
                livroList.add(livro);
            }
        }
        return livroList;
    }

    public String pesquisarPorTitulo(String titulo){
        String s = "";
        for (Livro livro: livros){
            if (livro.getTitulo().equals(titulo) && s == ""){
                s = livro.getTitulo();
            }
        }
        if (s == ""){
            s = "Livro não encontrado";
        }
        return s;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livros=" + livros +
                '}';
    }
}
