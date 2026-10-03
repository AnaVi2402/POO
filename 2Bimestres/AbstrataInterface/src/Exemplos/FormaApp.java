package Exemplos;

import java.util.ArrayList;

public class FormaApp {
    static void main(String[] args) {
        //cria um array de Exemplos.Forma
        ArrayList<Forma> formas = new ArrayList<>();

        Circulo ci = new Circulo("Vermelho", 3);
        Retangulo re = new Retangulo("Azul", 4,5);

        //adiciona no array
        formas.add(ci);
        formas.add(re);

        //percorre o array
        for(Forma obj : formas){
            System.out.println(obj.calcularArea());
        }
    }
}
