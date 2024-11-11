public class Main {
    public static void main(String[] args) {
        ProdutoEstoque produtoEstoque = new ProdutoEstoque("Infity Egde");

        Observer vendas = new Vendas();
        Observer marketing = new Marketing();
        Observer compras = new Compras();

        produtoEstoque.registerObserver(vendas);
        produtoEstoque.registerObserver(marketing);
        produtoEstoque.registerObserver(compras);

        // Simular o produto voltando ao estoque
        produtoEstoque.setEmEstoque(true);
    }
}