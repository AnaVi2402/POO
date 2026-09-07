public class ClienteApp {
    public static void main (String[] args){

        Cliente clien1 = new Cliente ("Ana", "ana24@gmail.com",50);
        Cliente clien2 = new Cliente ("Wilton","Will@gmail.com",90);

        clien1.exibirDados();
        clien2.exibirDados();

        clien1.setNome("Josefa");
        clien1.setEmail("Fada");

        clien2.setNome("Ana Maria Braga da Silva Carvalho Cardoso Alves Pedroso");

        clien1.exibirDados();
        clien2.exibirDados();
    }
}
