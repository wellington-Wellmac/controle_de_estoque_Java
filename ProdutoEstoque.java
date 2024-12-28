import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoEstoque {
    String nome;
    int quantidade;
    double preco;

    public ProdutoEstoque(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s | Quantidade: %d | Preço: R$ %.2f | Total: R$ %.2f",
                nome, quantidade, preco, valorTotal());
    }
}
