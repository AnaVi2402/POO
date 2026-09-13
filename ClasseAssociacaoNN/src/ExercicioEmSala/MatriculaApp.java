package ExercicioEmSala;

public class MatriculaApp {
    public static void main(String[] args){

        Aluno carla = new Aluno("Carla", 123);
        Aluno bruno = new Aluno("Bruno",456);

        Disciplina poo = new Disciplina("Programação Orientada a Objetos","POO");
        Disciplina bd = new Disciplina("Banco de Dados", "BD");

        Matricula m1 = Matricula.matricular(1001, poo, carla);
        Matricula m2 = Matricula.matricular(1002, bd, bruno);
        Matricula m3 = Matricula.matricular(1003, bd, carla);

        carla.listDisciplinas();
        bruno.listDisciplinas();
        poo.listAlunos();
        bd.listAlunos();
    }
}
