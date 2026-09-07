package exercicio01;

public class TurmaProfApp {
    public static void main(String[] args){

        Professor prof1 = new Professor("Daniel","Java");
        Turma T1 = new Turma("1º ADS",prof1);

        T1.imiprimirProfessor();
    }
}
