package desafio;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Escola() {
        this("Sem nome");
    }

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void matriculaAluno (Aluno aluno){
        this.alunos.add(aluno);
    }
    public void imprimirAlunos (){
        System.out.println("Na escola " + this.nome + " está matriculado os alunos: ");
        for (Aluno aluno : this.alunos){
            System.out.println(aluno.toString());
        }
    }
}
