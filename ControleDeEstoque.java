import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        ArrayList<ProdutoEstoque> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Atualizar Quantidade");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Valor Total do Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    estoque.add(new ProdutoEstoque(nome, quantidade, preco));
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    boolean encontrado = false;
                    for (ProdutoEstoque p : estoque) {
                        if (p.nome.equalsIgnoreCase(nomeAtualizar)) {
                            System.out.print("Digite a nova quantidade: ");
                            p.quantidade = scanner.nextInt();
                            System.out.println("Quantidade atualizada!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de Produtos:");
                    for (ProdutoEstoque p : estoque) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    double valorTotal = 0;
                    for (ProdutoEstoque p : estoque) {
                        valorTotal += p.valorTotal();
                    }
                    System.out.printf("Valor Total do Estoque: R$ %.2f%n", valorTotal);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
