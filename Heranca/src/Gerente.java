public class Gerente extends Funcionario{
    private double bonusGerencial;

    public Gerente() {
        this("Sem nome", 0, 0);
    }

    public Gerente(String nome, double salario, double bonusGerencial) {
        super(nome, salario);
        this.bonusGerencial = bonusGerencial;
    }

    public double getBonusGerencial() {
        return bonusGerencial;
    }

    public void setBonusGerencial(double bonusGerencial) {
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public double calcularBonus() {
        return super.calcularBonus() + this.bonusGerencial;
    }
    //Se não for colocado o super ele entra em loop infinito

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                "bonusGerencial=" + bonusGerencial +
                '}';
    }
}
