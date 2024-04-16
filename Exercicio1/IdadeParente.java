class IdadeParente {

  public static void main(String[] args) {
      // declarando a primeira idade
      int idade1 = 58;
      
      //imrpime a primeira idade
      System.out.println("Primeira idade: " + idade1);
      
      //declarando a segunda idade
      int idade2 = 46;
      
      //imprime a segunda idade
      System.out.println("Segunda idade: " + idade2);
      
      // Calcula a media das idades.
      double mediaIdade;
      mediaIdade = (idade1 + idade2)/2.0;

      // imprime  media de idade.
      System.out.println("Media de idade: " + mediaIdade);
      
      double distanciaIdade;
      distanciaIdade = idade1 - idade2;
      
      // imprime a distancia de idade.
      System.out.println("Distancia de idade: " + distanciaIdade);
      
      // Calcula o desvio da primeira idade idade.
      double desvioIdade1;
      desvioIdade1 = (idade1 - mediaIdade);
      
      // imprime o desvio da primeira idade.
      System.out.println("Desvio da primeira idade: " + desvioIdade1);
      
       // Calcula o desvio da primeira idade idade.
      double desvioIdade2;
      desvioIdade2 = (idade2 - mediaIdade);
      
      // imprime o desvio da primeira idade.
      System.out.println("Desvio da segunda idade: " + desvioIdade2);
      
      // Calcula a variância das idades.
      double varianciaIdade;
      varianciaIdade = (desvioIdade1 * desvioIdade1) + (desvioIdade2 * desvioIdade2);
      
      // imprime a variancia das idades.
      System.out.println("Variancia das idades: " + varianciaIdade);
      
      // Calcula o desvio padrão das idades.
      double dpIdade;
      dpIdade = Math.sqrt(varianciaIdade);
      
      //imprime o desvio padrao das idades.
      System.out.println("Desvio padrao das idades: " + dpIdade);
      
      // Verificação se a idade está acima ou abaixo da média
      String statusIdade1 = (idade1 > mediaIdade) ? "acima" : "abaixo";
      String statusIdade2 = (idade2 > mediaIdade) ? "acima" : "abaixo";

      System.out.println("Status da primeira idade em relação à média: " + statusIdade1);
      System.out.println("Status da segunda idade em relação à média: " + statusIdade2);
  }
}