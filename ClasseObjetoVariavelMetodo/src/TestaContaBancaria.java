public class TestaContaBancaria {
    public TestaContaBancaria() {
    }

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Ana Souza", "1001", (double)500.0);
        ContaBancaria conta2 = new ContaBancaria("Carlos Lima", "1002", (double)1000.0);
        ContaBancaria conta3 = new ContaBancaria();

        conta1.depositar((double)200.0);
        conta1.sacar((double)150.0);
        conta1.exibirDados();

        conta2.depositar((double)50.0);
        conta2.exibirDados();

        conta3.exibirDados();

        System.out.println("Total de contas: " + ContaBancaria.getTotalContas());
        System.out.println("Taxa manutencao: R$ " + ContaBancaria.getTaxaManutencao());
    }
}
