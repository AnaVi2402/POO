package Exercicio01;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto() {
        this("Sem nome",0,0);
    }

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.print("===== MOTO ===== ");
        super.exibirDados();
        System.out.println(" | Cilindragem: " + this.cilindradas + "\n");
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
