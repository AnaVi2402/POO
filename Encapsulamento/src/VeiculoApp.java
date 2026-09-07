public class VeiculoApp {
    public static void main (String[] args) {

        Veiculo car1 = new Veiculo("pow0p45", 2004, 50);
        Veiculo car2 = new Veiculo("sdx0p09",1999,20);

        car1.exibirTexto();
        car2.exibirTexto();

        car1.setPlaca("poi0plok");
        car2.setAnoFabricacao(1852);
        car1.setValorDiaria(0);

        car1.exibirTexto();
        car2.exibirTexto();
    }
}
