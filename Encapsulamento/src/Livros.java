public class Livros {
    //variável de classe
    private static int totalLivros = 0;

    //variável de instância
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    //contrutor padrão
    public Livros() {
        this("Nenhum livro", "Nenhum autor");
    }

    //contrutor com parâmetros (sobrecarga)
    public Livros(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
        Livros.totalLivros++;
    }

    //getters - leitura
    public String getTitulo() {return this.titulo;}
    public String getAutor() {return this.autor;}
    public boolean isDisponivel() {return disponivel;}

    //métodos de intância
    public void emprestar (){
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Empréstimo do livro " + this.titulo + ", realizado com sucesso!\n");
        }
        else {
            System.out.println("Livro " + this.titulo + ", não está disponível\n");
        }
    }

    public void devolver (){
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Livro " + this.titulo + ", devolvido com sucesso!\n");
        }
        else {
            System.out.println("Livro não emprestado não pode ser disponível!");
        }
    }

    public void exibirFicha(){
        System.out.println ("Livro: " + this.titulo +
                "Autor: " + this.autor +
                "Disponível: " + (this.disponivel ? "Sim": "Não")+"\n");
    }

    //método de classe (static)
    public static int getTotalLivros (){
        return Livros.totalLivros;
    }
}
