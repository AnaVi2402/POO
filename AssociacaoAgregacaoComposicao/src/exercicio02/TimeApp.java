package exercicio02;

public class TimeApp {
    public static void main(String[] args){

        Time t1 = new Time("Corinthias");
        Jogador j1 = new Jogador("Hugo Souza", 1);
        Jogador j2 = new Jogador("Memphis Depay",10);
        Jogador j3 = new Jogador("Yuri Alberto", 9);

        t1.adicionaJogador(j1);
        t1.adicionaJogador(j2);
        t1.adicionaJogador(j3);

        t1.listarJogador();
    }
}
