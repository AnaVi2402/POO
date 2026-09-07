public class CasaApp {
    public static void main(String[] args){

        Casa c1 = new Casa("Rua das alianças, 1040");
        c1.adicionarComodo("Banheiro",3.2);
        c1.adicionarComodo("Cozinha", 8);
        c1.adicionarComodo("Quarto", 6);

        c1.exibirComodo();
    }
}
