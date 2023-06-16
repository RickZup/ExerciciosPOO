public class DVDs extends Produto{

    public int duracao;

    public DVDs(String nome, double preco, int codigoDeBarras, int duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(duracao);
    }
}
