class IdadeParente {

  public static void main(String[] args) {
      // imprime as idades.
      int idade1 = 58;
      int idade2 = 46;
      System.out.println(idade1 + idade2);

      // gera a media das idades.
      double mediaIdade;
      mediaIdade = (idade1 + idade2)/2 ;

      // imprime a idade.
      System.out.println(mediaIdade);
      
      double distanciaIdade;
      distanciaIdade = idade1 - idade2;
      
      // imprime a distancia de idade.
      System.out.println(distanciaIdade);
      
      // Calcula o desvio da primeira idade idade.
      double desvioIdade1;
      desvioIdade1 = (idade1 - mediaIdade);
      
      // imprime o desvio da primeira idade.
      System.out.println(desvioIdade1);
      
       // Calcula o desvio da primeira idade idade.
      double desvioIdade2;
      desvioIdade2 = (idade2 - mediaIdade);
      
      // imprime o desvio da primeira idade.
      System.out.println(desvioIdade2);
      
      // Calcula a variância das idades.
      double varianciaIdade;
      varianciaIdade = (desvioIdade1 * desvioIdade1) + (desvioIdade2 * desvioIdade2);
      
      // imprime a variancia das idades.
      System.out.println(varianciaIdade);
      
      // Calcula o desvio padrão das idades.
      double dpIdade;
      dpIdade = Math.pow(varianciaIdade);
      
      //imprime o desvio padrão das idades.
      System.out.println(dpIdade);
      
  }
}
