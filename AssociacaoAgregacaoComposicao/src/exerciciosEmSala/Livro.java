package exerciciosEmSala;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int edicao;
    private boolean disponivel;

    public Livro() {
        this("sem título", "sem autor", 1900, 1);
    }

    public Livro(String titulo, String autor, int ano, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.edicao = edicao;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void emprestar(){
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("Emprestado");
        }
        else{
            System.out.println("Indisponível");
        }
    }

    @Override
    public String toString() {
        return "exerciciosEmSala.Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", edicao=" + edicao +
                ", disponivel=" + disponivel +
                '}';
    }
}
