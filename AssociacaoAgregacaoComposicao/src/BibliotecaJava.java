public class BibliotecaJava {
    public static void main(String[] args){

        Livro li1 = new Livro("Java para os forte", "Hulk", 2024, 1);
        Livro li2 = new Livro("Python para os fracos", "Robin", 2025,2);
        Livro li3 = new Livro("NodeJS para os backenders", "BK", 2026,1);
        Livro li4 = new Livro("ReactJS para os frontenders", "FE", 2022,3);

        Biblioteca bi1 = new Biblioteca("Biblioteca Municipal", "Av. Champagnat");
        bi1.adicionaLivro(li1);
        bi1.adicionaLivro(li2);
        bi1.adicionaLivro(li3);
        bi1.adicionaLivro(li4);

        bi1.exibeAcervo();
        bi1.emprestarLivro("Java para os forte", "Hulk", 2024, 1);
        bi1.exibeAcervo();
        bi1.emprestarLivro("Java para os forte", "Hulk", 2024, 1);
        bi1.exibeAcervo();

    }
}
