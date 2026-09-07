package exerciciosEmSala;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this("Sem nome", "Sem endereço");
    }

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        // aloca o espaço da memória para o vetor
        this.livros = new ArrayList<Livro>();
    }

    public void adicionaLivro(Livro livro){ //indica agregacao
        this.livros.add(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void exibeAcervo(){
        System.out.println("Nome: "+ this.nome + " Endereço: "+ this.endereco);
        //percorre o vetor e chama o toString() de cada livro
        for (Livro livro: this.livros){
            //livro vai apontar para cada elemento do vetor
            System.out.println(livro.toString());
        }
    }
    public boolean emprestarLivro(String titulo,String autor, int ano, int edicao){
        for(Livro livro: this.livros){
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor) && livro.getEdicao() == edicao && livro.getAno() == ano){
                livro.emprestar();
                return true;
            }
        }
        return false;
    }
}
