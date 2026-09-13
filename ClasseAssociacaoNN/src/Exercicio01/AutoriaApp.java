package Exercicio01;

public class AutoriaApp {
    public static void main (String[] args){
        Autor a1 = new Autor("Wilton José");
        Autor a2 = new Autor("Ana Vitória Alves");

        Livro l1 = new Livro("A Cavalaria");
        Livro l2 = new Livro("O cego no tiroteio");

        Autoria.autorar("Autor principal", a1,l1);
        Autoria.autorar("Autor secundário",a2,l1);
        Autoria.autorar("Autor principal", a2,l2);

        l1.listAutores();
        l2.listAutores();
    }
}
