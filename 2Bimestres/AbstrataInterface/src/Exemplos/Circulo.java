package Exemplos;

public class Circulo extends Forma{
    private double raio;

    public Circulo(){
        super();
    }
    public Circulo(String cor, float raio){
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * (raio*raio);
    }
}
