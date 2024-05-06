public class Main {
    public static void main(String[] args) {
        InstrumentoMusical instrumento = new InstrumentoMusical();
        Guitarra guitarra = new guitarra();

        // Testando os mtodos da classe InstrumentoMusical

        instrumento.tocar();
        instrumento.afinar();

        System.out.println("\n");

        // Testando os metodos da classe guitarra

        guitarra.tocar();
        guitarra.afinar();
        guitarra.trocarCorda();

        System.out.println("\n");

        // Polimorfismo
        // A instancia de guitarra pode ser tratada como uma instancia de InstrumentoMusical

        InstrumentoMusical outroInstrumento = new guitarra();

        outroInstrumento.tocar();
        outroInstrumento.afinar();

    }
}