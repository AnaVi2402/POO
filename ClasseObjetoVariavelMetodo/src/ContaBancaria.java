public class ContaBancaria {

    // variáveis de classe (static)
    static int totalContas = 0;
    static final double TAXA_MANUTENCAO = 12.0;

    // variáveis de instância
    String titular;
    String numero;
    double saldo;

    // construtor padrão
    public ContaBancaria() {
        this("Sem titular", "0000", 0.0);
    }

    // construtor com parâmetros (sobrecarga)
    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
        totalContas++;              // atualiza a variável de classe
    }
    // métodos de instância
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente!");
    }
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }

    // métodos de classe (static)
    public static int getTotalContas() {
        return totalContas;
    }
    public static double getTaxaManutencao() {
        return TAXA_MANUTENCAO;
    }
}
