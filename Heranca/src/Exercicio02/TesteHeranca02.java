package Exercicio02;

import java.util.ArrayList;

public class TesteHeranca02 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        double totalArea = 0;

        formas.add(new Circulo(5));
        formas.add(new Retangulo(6,4));

        for(Forma f : formas){
            System.out.println("Área do " + f.getClass().getSimpleName() + ": " + f.calcularArea());

            totalArea += f.calcularArea();
        }
        System.out.println("A soma total de todas as áreas é " + totalArea);
    }
}
