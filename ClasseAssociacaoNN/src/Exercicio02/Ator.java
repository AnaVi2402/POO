package Exercicio02;

import java.util.ArrayList;

public class Ator {
    private String nome;
    private ArrayList<Atuacao> atuacoes;


    public Ator() {
        this("Sem nome");
    }

    public Ator(String nome) {
        this.nome = nome;
        this.atuacoes = new ArrayList<>();
    }
    public void adicionaAtuacao(Atuacao atuacao){
        this.atuacoes.add(atuacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
