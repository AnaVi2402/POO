package Exercicio01;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private ArrayList<Autoria> autorias;

    public Livro() {
        this("Sem titulo");
    }

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autorias = new ArrayList<>();
    }

    public void adicionaAutoria (Autoria autoria){
        this.autorias.add(autoria);
    }
    public void listAutores(){
        System.out.println("Segue os autores do livro "+ this.titulo);
        for (Autoria autoria : this.autorias){
            System.out.println(autoria.getPapel() + ": " + autoria.getAutor().getNome());
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
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
