public class Veiculo {

    private String placa;
    private int anoFabricacao;
    private double valorDiaria;

    public Veiculo() { this("Sem placa", 0,0.0);}

    public Veiculo(String placa, int anoFabricacao, double valorDiaria){
        setPlaca(placa);
        setAnoFabricacao(anoFabricacao);
        setValorDiaria(valorDiaria);
    }

    public String getPlaca(){ return this.placa;}
    public int getAnoFabricacao() {return this.anoFabricacao;}
    public double getValorDiaria() {return this.valorDiaria;}

    public void setPlaca(String placa){
        if (placa == null || placa.length() != 7) {
            System.out.println("\nPlaca inválida!");
        }
        else{
            this.placa = placa;
        }
    }
    public void setAnoFabricacao(int anoFabricacao){
        if(anoFabricacao < 1990 || anoFabricacao > 2026) {
            System.out.println("\nAno de fabricação inválido!");
        }else {
            this.anoFabricacao = anoFabricacao;
        }
    }
    public void setValorDiaria(double valorDiaria){
        if (valorDiaria <= 0){
            System.out.println("\nValor de diária inválido!");
        }else{
            this.valorDiaria = valorDiaria;
        }
    }
    public void exibirTexto(){
        System.out.println("\nPlaca: " + this.placa + "\nAno de fabricação: " + this.anoFabricacao + "\nValor diária: " + this.valorDiaria);
    }
}
