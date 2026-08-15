public class EstoqueProduto {
    public static void main (String[] args){

        Produto produto1 = new Produto ("Panela",20.50);
        Produto produto2 = new Produto ("Liquidificador",50.0);
        Produto produto3 = new Produto ("Batedeira",40.0);

        produto1.venda();
        produto2.venda();

        produto1.exibirEstoque();
        produto2.exibirEstoque();
        produto3.exibirEstoque();

        System.out.println("O total de entrada dos produtos foram: " + Produto.getEntradaProdutos());
        System.out.println("O total de produtos vendidos foram: " + Produto.getSaidaProdutos());
        System.out.println("O total do caixa é: " + Produto.getCaixa());
    }
}
