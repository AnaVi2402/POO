package Exercicio02;

public class Atuacao {
    private String personagem;
    private Ator ator;
    private Filme filme;

    public Atuacao() {
        this("Sem personagem", new Ator(), new Filme());
    }

    public Atuacao(String personagem, Ator ator, Filme filme) {
        this.personagem = personagem;
        this.ator = ator;
        this.filme = filme;
    }
    public static Atuacao atuar (String personagem, Ator ator, Filme filme){
        Atuacao at = new Atuacao(personagem, ator, filme);
        ator.adicionaAtuacao(at);
        filme.adicionaAtuacao(at);
        return at;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Atuacao{" +
                "personagem='" + personagem + '\'' +
                '}';
    }
}
