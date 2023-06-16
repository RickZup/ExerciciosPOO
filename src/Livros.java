public class Livros extends Produto {

    public String autor;

    public Livros(String nome, double preco, int codigoDeBarras, String autor) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(autor);
    }
}
