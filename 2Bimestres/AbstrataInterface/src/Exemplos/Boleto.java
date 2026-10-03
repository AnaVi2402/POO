package Exemplos;

public class Boleto implements Pagavel, Cancelavel{

    @Override
    public void pagar(double valor) {
        System.out.println("Exemplos.Boleto no valor de R$ " + valor);
    }

    @Override
    public boolean cancelar() {
        System.out.println("Exemplos.Boleto cancelado antes do vencimento");
        return true;
    }
}
