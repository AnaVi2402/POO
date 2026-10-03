package Exemplos;

public class Gerente extends Funcionario{

    private double bonus;

    @Override
    double calcularSalario(){
        return this.salario + this.bonus;
    }
}
