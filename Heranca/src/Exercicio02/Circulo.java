package Exercicio02;

public class Circulo extends Forma{
    private double raio;

    public Circulo() {
        this(0);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return Math.PI*this.raio*this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
