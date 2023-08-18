package CatalogoLivros;


public class Livro {

    private String titulo;

    private String Autor;

    private int anoDePublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        Autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }
}
