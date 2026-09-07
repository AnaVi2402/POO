package exerciciosEmSala;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int nro;
    private double total;
    private LocalDateTime data;
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        this(0,LocalDateTime.now());
    }

    public Pedido(int nro, LocalDateTime data) {
        this.nro = nro;
        this.data = data;
        this.itens = new ArrayList<ItemPedido>();
    }

    public void adicionaItemPedido (int id,String produto, int qtde, double valor){
        this.itens.add(new ItemPedido(id,produto,qtde,valor));
        this.total = this.total + (qtde * valor);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void exibeItens(){
        for(ItemPedido itemPedido : this.itens){
            System.out.println(itemPedido.toString());
        }
    }
}
