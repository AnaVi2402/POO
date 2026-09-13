package ExercicioEmSala;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String sigla;
    private ArrayList<Matricula> matriculas;

    public Disciplina() {
        this("Sem nome","Sem sigla");
    }

    public Disciplina(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.matriculas = new ArrayList<Matricula>();
    }
    public void adicionaMatricula (Matricula matricula){
        this.matriculas.add(matricula);
    }
    public void listAlunos(){
        //percorre o vetor de matrículas
        System.out.println("Lista de alunos da disciplina: " + this.nome);
        for(Matricula matricula : this.matriculas){
            System.out.println(matricula.getAluno().getNome());
        }
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ExercicioEmSala.Disciplina{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
