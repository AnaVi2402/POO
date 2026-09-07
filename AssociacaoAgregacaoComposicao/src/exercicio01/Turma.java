package exercicio01;

public class Turma {
    private String nome;
    private Professor professor;

    //Contrutor padrão
    public Turma() {
        this("Sem nome", new Professor());
    }

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //return professor responsável
    public Professor getProfessor() {

        return this.professor;
    }

    public void imiprimirProfessor(){
        System.out.println("O professor responsável pela turma " + this.nome + ", é " + getProfessor().getNome()+".");
    }
}
