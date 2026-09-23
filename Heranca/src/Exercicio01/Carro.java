package Exercicio01;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro() {
        this("Sem marca",0,0);
    }

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDados() {
        System.out.print("===== CARRO ===== ");
        super.exibirDados();
        System.out.println(" | Total de portas: " + this.numeroPortas + "\n");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
