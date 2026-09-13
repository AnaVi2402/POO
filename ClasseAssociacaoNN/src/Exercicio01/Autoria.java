package Exercicio01;

public class Autoria {
    private String papel;
    private Autor autor;
    private Livro livro;

    public Autoria() {
        this("Sem papel", new Autor(), new Livro());
    }

    public Autoria(String papel, Autor autor, Livro livro) {
        this.papel = papel;
        this.autor = autor;
        this.livro = livro;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    public static Autoria autorar (String autorPrincipal, Autor autor, Livro livro){
        Autoria a = new Autoria(autorPrincipal, autor, livro);
        autor.adicionaAutoria(a);
        livro.adicionaAutoria(a);
        return a;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Autoria{" +
                "papel='" + papel + '\'' +
                ", autor=" + autor +
                ", livro=" + livro +
                '}';
    }
}
