package Exercicio02;

public class AtuacoesApp {
    public static void main (String[] args){
        Ator a1 = new Ator("Leonardo DiCaprio");
        Ator a2 = new Ator("Sylvester Stallone");
        Ator a3 = new Ator("Kate Winslet");

        Filme f1 = new Filme("Titanic");
        Filme f2 = new Filme("Prenda-me se for capaz");
        Filme f3 = new Filme("Rocky Balboa");

        Atuacao.atuar("Jack", a1, f1);
        Atuacao.atuar("Frank Abagnale Jr.", a1, f2);
        Atuacao.atuar("Rocky Balboa", a2, f3);
        Atuacao.atuar("Rose", a3, f1);

        f1.listElenco();
        f2.listElenco();
        f3.listElenco();
    }
}
