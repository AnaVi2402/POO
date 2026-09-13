package Exercicio01;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private ArrayList<Autoria> autorias;

    public Autor() {
        this("Sem nome");
    }

    public Autor(String nome) {
        this.nome = nome;
        this.autorias = new ArrayList<>();

    }
    public void adicionaAutoria (Autoria autoria){
        this.autorias.add(autoria);

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
