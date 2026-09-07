package exerciciosEmSala;

import java.time.LocalDateTime;

public class PedidoApp {
    public static void main(String[] args){

        Pedido ped1 = new Pedido(1, LocalDateTime.now());

        ped1.adicionaItemPedido(1,"bola de basquete",3,400);
        ped1.adicionaItemPedido(2,"mouse sem fio",5,130);
        ped1.adicionaItemPedido(3,"8 GB DDR4",2,400);

        System.out.println("Total do pedido: " + ped1.getTotal());

        ped1.exibeItens();

    }
}
