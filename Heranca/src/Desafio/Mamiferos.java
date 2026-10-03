package Desafio;

public class Mamiferos {
    protected String corPelos;

    public Mamiferos() {
        this("Sem cor");
    }

    public Mamiferos(String corPelos) {
        this.corPelos = corPelos;
    }

    public String getCorPelos() {
        return corPelos;
    }

    public void setCorPelos(String corPelos) {
        this.corPelos = corPelos;
    }
}
