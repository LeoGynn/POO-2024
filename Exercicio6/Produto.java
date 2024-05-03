import java.util.Scanner;

public class Produto {
  // Atributos
  
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

  // Definindo os atributos
  
    public Produto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        this.nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        this.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto:");
        this.quantidadeEmEstoque = scanner.nextInt();
    }
  
// Método de adicionar o produto no carrinho
  
    public void adicionarAoCarrinho() {
        if (this.quantidadeEmEstoque > 0) {
            System.out.println("Produto " + this.nome + " adicionado ao carrinho!");
            this.quantidadeEmEstoque--;
        } else {
            System.out.println("Desculpe, produto fora de estoque.");
        }
    }

  // Método de remover o produto do carrinho
  
    public void removerDoCarrinho() {
        System.out.println("Produto " + this.nome + " removido do carrinho!");
        this.quantidadeEmEstoque++;
    }
}
