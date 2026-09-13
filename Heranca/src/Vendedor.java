public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(){
        this("Sem nome", 0, 0);
    }
    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.10;

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() +
                "totalVendas=" + totalVendas +
                '}';
    }
}
