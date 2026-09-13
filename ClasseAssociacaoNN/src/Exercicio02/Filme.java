package Exercicio02;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Atuacao> atuacoes;

    public Filme() {
        this("Sem título");
    }

    public Filme(String titulo) {
        this.titulo = titulo;
        this.atuacoes = new ArrayList<>();
    }
    public void adicionaAtuacao(Atuacao atuacao){
        this.atuacoes.add(atuacao);
    }
    public void listElenco(){
        System.out.println("\nSegue o elenco do filme " + this.titulo +": ");
        for (Atuacao atuacao : this.atuacoes){
            System.out.println("   *" + atuacao.getPersonagem() + " interpretado por " + atuacao.getAtor().getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
