package Exemplos;

public class Pix implements Pagavel, Cancelavel{

    @Override
    public void pagar(double valor) {
        System.out.println("Exemplos.Pix no valor de R$ " + valor);
    }

    @Override
    public boolean cancelar() {
        System.out.println("Exemplos.Pix estornado");
        return true;
    }
}
