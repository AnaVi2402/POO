package Exemplos;

public abstract class Funcionario implements Pagavel{

    protected String nome;
    protected double salario;

    @Override
    public void pagar(double valor) {
        System.out.println(this.nome + " R$: " + this.calcularSalario());
    }
    abstract double calcularSalario();
}
