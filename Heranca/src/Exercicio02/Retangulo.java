package Exercicio02;

public class Retangulo extends Forma{
    private double largura;;
    private double altura;

    public Retangulo() {
        this(0,0);
    }
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return this.largura*this.altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
