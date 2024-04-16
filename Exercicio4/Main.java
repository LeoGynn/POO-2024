package Exercicio4;

public class Main {
    public static void main(String[] args) {
        // Instanciando dois objetos da classe Produto
        Produto cocaCola = new Produto();
        Produto cocaColaZero = new Produto();

        // Alterando os atributos dos objetos
        cocaCola.nome = "Coca-Cola";
        cocaCola.preco = 1.5;
        cocaCola.quantidadeEmEstoque = 100;

        cocaColaZero.nome = "Coca-Cola Zero";
        cocaColaZero.preco = 1.5;
        cocaColaZero.quantidadeEmEstoque = 100;

        // Invocando os métodos
        cocaCola.adicionarAoCarrinho();
        cocaColaZero.removerDoCarrinho();
    }
}
