package Exemplos;

public class Estagiario extends Funcionario{

    @Override
    double calcularSalario(){
        return this.salario * 0.80;
    }
}
