import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time() {
        this("Sem nome");
    }

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<Jogador>();
    }
    public void adicionaJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void listarJogador(){
        System.out.println("Segue os jogadores do time " + this.nome + ":");
        for(Jogador jogador : this.jogadores){
            System.out.println(jogador.toString());
        }
    }
}
