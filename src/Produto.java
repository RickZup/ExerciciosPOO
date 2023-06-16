public class Produto {

    public String nome;
    public double preco;

    public int codigoDeBarras;

    public Produto(String nome, double preco, int codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public void mostrarDetalhesDoItem(){
        System.out.println(nome);
        System.out.println(preco);
    }

}
