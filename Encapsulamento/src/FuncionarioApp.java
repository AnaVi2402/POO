public class FuncionarioApp {
    public static void main (String[] args){

        Funcionario f1 = new Funcionario ("Ana", 4000.0,40);
        Funcionario f2 = new Funcionario ("Wilton", 6000.0, 30);

        f1.setNome("Anna");

        f1.exibirDados();
        f2.exibirDados();

        f2.setNome("Ana Vitória Alves de Oliveira Fernadan Leticia Ana Vitória Isadora isabela");

        f2.exibirDados();
    }
}
