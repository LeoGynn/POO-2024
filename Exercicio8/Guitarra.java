// Subclasse

class Guitarra extends InstrumentoMusical {

    // Alternando o comportamento dos metodos "tocar" e "trocarcorda" com o @Override

    @Override
    void tocar() {
        System.out.println("Tocando a guitarra.");
    }

    void trocarCorda() {
        System.out.println("Trocando a corda da guitarra.");
    }
}