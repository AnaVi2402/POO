public class Jogador {
    private String nome;
    private int numeroCamisa;

    public Jogador() {
        this("Sem nome", 0);
    }

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numeroCamisa=" + numeroCamisa +
                '}';
    }
}
