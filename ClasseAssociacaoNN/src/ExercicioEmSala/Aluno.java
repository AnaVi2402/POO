package ExercicioEmSala;

import java.util.ArrayList;

public class Aluno{
    private String nome;
    private int ra;
    private ArrayList<Matricula> matriculas;

    public Aluno() {
        this("Sem nome",0);
    }

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
        this.matriculas = new ArrayList<Matricula>();
    }

    public void adicionaMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }
    public void listDisciplinas(){
        //percorre o vetor de matriculas
        System.out.println("Lista de disciplinas do aluno " + this.nome);
        for(Matricula matricula : this.matriculas){ //: percorre o valor matrícula
            System.out.println(matricula.getDisciplina().getNome());
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "ExercicioEmSala.Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                '}';
    }
}
