package Exercicio5;

// Classe Programa
public class Programa {
    // Testando os construtores e atributos da classe Campeao
    public static void main(String[] args) {
        
        // Usando o construtor default
        Campeao campeao1 = new Campeao();
        System.out.println("Nome: " + campeao1.getNome());
        System.out.println("Armadura: " + campeao1.getArmadura());
        System.out.println("Dano de Ataque: " + campeao1.getDanoDeAtaque());
        System.out.println("Resistencia Magica: " + campeao1.getResistenciaMagica());

        // Usando o construtor com parametros
        Campeao campeao2 = new Campeao("Lee Sin", 50, 70, 60);
        System.out.println("Nome: " + campeao2.getNome());
        System.out.println("Armadura: " + campeao2.getArmadura());
        System.out.println("Dano de Ataque: " + campeao2.getDanoDeAtaque());
        System.out.println("Resistencia Magica: " + campeao2.getResistenciaMagica());

        // Usando o construtor de copia
        Campeao campeao3 = new Campeao(campeao2);
        System.out.println("Nome: " + campeao3.getNome());
        System.out.println("Armadura: " + campeao3.getArmadura());
        System.out.println("Dano de Ataque: " + campeao3.getDanoDeAtaque());
        System.out.println("Resistencia Magica: " + campeao3.getResistenciaMagica());

        // Testando atributo estatico
        System.out.println("Total de campeoes criados: " + Campeao.getContadorCampeoes());
    }
}