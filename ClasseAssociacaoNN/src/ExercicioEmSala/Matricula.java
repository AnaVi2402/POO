package ExercicioEmSala;

import java.time.LocalDateTime;

public class Matricula {
    private int nro;
    private Disciplina disciplina;
    private Aluno aluno;
    private LocalDateTime data;
    private boolean ativa;

    public Matricula() {
        this(0,new Aluno(), new Disciplina());
    }

    public Matricula(int nro,Aluno aluno, Disciplina disciplina) {
        this.nro = nro;
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.ativa = true;
        this.data = LocalDateTime.now();
    }
    public static Matricula matricular(int nro, Disciplina disciplina, Aluno aluno){
        Matricula m = new Matricula(nro, aluno,disciplina);
        aluno.adicionaMatricula(m);
        disciplina.adicionaMatricula(m);
        return m;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "ExercicioEmSala.Matricula{" +
                "nro=" + nro +
                ", disciplina=" + disciplina +
                ", aluno=" + aluno +
                ", data=" + data +
                ", ativa=" + ativa +
                '}';
    }
}
