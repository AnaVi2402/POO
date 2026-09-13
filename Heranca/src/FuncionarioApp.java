public class FuncionarioApp {
    public static void main(String[] args){
        Funcionario func = new Funcionario("Marcia",5000);
        System.out.println(func.toString());

        Gerente ge = new Gerente("Pedro", 600, 600);
        System.out.println(ge);

        Vendedor ve = new Vendedor("Flávia", 1000,10000);
        System.out.println(ve);
    }
}
