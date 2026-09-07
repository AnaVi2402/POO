package desafio;

public class EscolaAlunoApp {
    public static void main(String[] args){
        Escola esc1 = new Escola("Maria Cintra");

        Aluno al1 = new Aluno("Ana Vitória","1234");
        Aluno al2 = new Aluno("Wilton José","5678");
        Aluno al3 = new Aluno("Letícia Fernanda","9012");

        esc1.matriculaAluno(al1);
        esc1.matriculaAluno(al2);
        esc1.matriculaAluno(al3);

        esc1.imprimirAlunos();
    }
}
