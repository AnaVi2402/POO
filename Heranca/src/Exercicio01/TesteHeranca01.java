package Exercicio01;

import java.util.ArrayList;

public class TesteHeranca01 {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Honda Civic", 2010, 4));
        veiculos.add(new Moto("Yamaha FZ15", 2023, 150));

        for (Veiculo v : veiculos){
            v.exibirDados();
        }
    }
}
