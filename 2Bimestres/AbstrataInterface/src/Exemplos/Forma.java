package Exemplos;

public abstract class Forma {
    protected String cor;

    public Forma(){

    }
    public Forma(String cor){
        this.cor = cor;
    }
    public abstract double calcularArea();
}
