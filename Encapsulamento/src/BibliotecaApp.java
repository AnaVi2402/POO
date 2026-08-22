public class BibliotecaApp {

    public static void main(String[] args){

        // criando objetos (instâncias) a partir da classe
        Livros livro1 = new Livros ("O menino do pijama listrado", "John Boyne");
        Livros livro2 = new Livros ("A loucura que mudou a história", "Christopher J. Ferguson");
        Livros livro3 = new Livros ("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        // chamando métodos de instância
        livro1.emprestar();

        livro2.emprestar();

        livro1.devolver();

        //ficha de livros
        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();

        System.out.println ("Total de livros cadastrados: "+ Livros.getTotalLivros());
    }
}
