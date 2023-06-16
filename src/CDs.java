public class CDs extends Produto{

    public int numeroDeFaixas;

    public CDs(String nome, double preco, int codigoDeBarras, int numeroDeFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(numeroDeFaixas);
    }
}
