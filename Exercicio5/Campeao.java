// Classe Campeao
public class Campeao {
    // Atributos privados
    private String nome;
    private int armadura;
    private int danoDeAtaque;
    private int resistenciaMagica;
    
    // Atributo estatico
    private static int contadorCampeoes = 0;

    // Construtores
    // Construtor default
    public Campeao() {
        this.nome = "Campeao";
        this.armadura = 0;
        this.danoDeAtaque = 0;
        this.resistenciaMagica = 0;
        contadorCampeoes++;
    }

    // Construtor com parametros
    public Campeao(String nome, int armadura, int danoDeAtaque, int resistenciaMagica) {
        this.nome = nome;
        this.armadura = armadura;
        this.danoDeAtaque = danoDeAtaque;
        this.resistenciaMagica = resistenciaMagica;
        contadorCampeoes++;
    }

    // Construtor de copia
    public Campeao(Campeao outro) {
        this.nome = outro.nome;
        this.armadura = outro.armadura;
        this.danoDeAtaque = outro.danoDeAtaque;
        this.resistenciaMagica = outro.resistenciaMagica;
        contadorCampeoes++;
    }

    // Metodos Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getDanoDeAtaque() {
        return danoDeAtaque;
    }

    public void setDanoDeAtaque(int danoDeAtaque) {
        this.danoDeAtaque = danoDeAtaque;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    // Metodo estatico para obter o numero total de campeoes criados
    public static int getContadorCampeoes() {
        return contadorCampeoes;
    }
}