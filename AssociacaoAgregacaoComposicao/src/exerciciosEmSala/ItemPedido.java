package exerciciosEmSala;

public class ItemPedido {
    private int id;
    private String produto;
    private int qtde;
    private double valor;

    public ItemPedido() {
        this(0,"Sem produto",0,0.0);
    }

    public ItemPedido(int id, String produto, int qtde, double valor) {
        this.id = id;
        this.produto = produto;
        this.qtde = qtde;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "exerciciosEmSala.ItemPedido{" +
                "id=" + id +
                ", produto='" + produto + '\'' +
                ", qtde=" + qtde +
                ", valor=" + valor +
                '}';
    }
}
