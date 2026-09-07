public class Comodo {
    private String nome;
    private double areaM2;

    public Comodo() {
        this("Sem nome",0.0);
    }

    public Comodo(String nome, double areaM2) {
        this.nome = nome;
        this.areaM2 = areaM2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    @Override
    public String toString() {
        return "Comodo{" +
                "nome='" + nome + '\'' +
                ", areaM2=" + areaM2 +
                '}';
    }
}