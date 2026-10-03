package Exercicio1;

public class Carro extends Veiculo {

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularImposto(){
        return 500;
    }

}
