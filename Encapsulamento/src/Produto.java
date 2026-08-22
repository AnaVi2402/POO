public class Produto {

    //variável de classe (static)
    private static int entradaProdutos = 0;
    private static int saidaProdutos = 0;
    private static double caixa = 0.0;

    //variável de instância
    private String nome;
    private double custo;
    private boolean disponivel = true;

    //contrutor padrão
    public Produto(){
        this("Sem nome", 0.0);
    }

    //construtor com parâmetro (sobrecarga)
    public Produto (String nome, double custo) {
        this.nome = nome;
        this.custo = custo;
        Produto.entradaProdutos++;
    }

    public String getNome () {return this.nome;}
    public double getCusto() {return this.custo;}
    public boolean isDisponivel () {return disponivel;}

    //métodos de instância
    public void venda (){
        if (this.disponivel){
            this.disponivel = false;
            System.out.println ("Venda do produto " + this.nome + " feita com sucesso! Valor da venda " + this.custo + "\n");
            Produto.saidaProdutos++;
            Produto.caixa += this.custo;
        }
        else {
            System.out.println("Produto não está disponível no estoque! \n");
        }
    }

    public void exibirEstoque (){
        System.out.println("Produto: " + this.nome);
        System.out.println("Valor: R$" + this.custo);
        System.out.println("Status do produto: " + (this.disponivel ? "Disponível em estoque!" : "Produto vendido!" ) + "\n");
    }

    //métodos de classe (static)
    public static int getEntradaProdutos (){
        return Produto.entradaProdutos;
    }
    public static int getSaidaProdutos (){
        return Produto.saidaProdutos;
    }
    public static double getCaixa (){
        return Produto.caixa;
    }
}
