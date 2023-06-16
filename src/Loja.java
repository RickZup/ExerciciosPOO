import java.util.ArrayList;
import java.util.List;

public class Loja {

    public static void main(String[] args) {

        List<Produto> itens = new ArrayList<>();

        itens.add(new Livros("O Hobbit", 30, 123456789, "J.R.R. Tolkien"));
        itens.add(new DVDs("Avatar", 30, 234567891, 120));
        itens.add(new CDs("This is Rihanna", 50, 345678912, 9));
        itens.add(new Livros("Evangelho de Sangue", 60, 666666666, "Clive Barker"));
        itens.add(new Livros("A cor que caiu do céu", 25, 456789123, "H.P. Love Craft"));
    }
}
