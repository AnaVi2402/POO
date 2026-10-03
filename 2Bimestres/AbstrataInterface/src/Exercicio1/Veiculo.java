package Exercicio1;

public abstract class Veiculo {
    protected String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }
    abstract double calcularImposto();
    void exibirPlaca(){
        System.out.println("Placa: " + placa);
    }
}
