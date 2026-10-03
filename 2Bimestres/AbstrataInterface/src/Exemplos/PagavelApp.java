package Exemplos;

import java.util.ArrayList;

public class PagavelApp {
    public static void main(String[] args){
        ArrayList<Pagavel> pagaveis = new ArrayList<>();

        Pix pix1 = new Pix();
        Boleto bol1 = new Boleto();

        pagaveis.add(pix1);
        pagaveis.add(bol1);

        for(Pagavel obj : pagaveis){
            obj.pagar(300);
        }

        ArrayList<Cancelavel> cancelaveis = new ArrayList<>();
        cancelaveis.add(pix1);
        cancelaveis.add(bol1);

        for (Cancelavel obj: cancelaveis){
            System.out.println(obj.cancelar());
        }
    }
}
