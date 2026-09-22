import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioApp {
    public static void aux(Funcionario f){
        System.out.println(f.toString());
    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe nome do funcionário: ");
        String nome = leitor.next();
        System.out.println("Informe o salário do funcionário: ");
        double salario = leitor.nextDouble();
        Funcionario func = new Funcionario("Marcia",5000);

        Gerente ge = new Gerente("Pedro", 600, 600);

        Vendedor ve = new Vendedor("Flávia", 1000,10000);

        ArrayList<Funcionario> vetor = new ArrayList<>();
        vetor.add(func);
        vetor.add(ge);
        vetor.add(ve);

        for(Funcionario f : vetor){
            aux(f);
        }
    }
}
