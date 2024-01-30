package primeirasaulas;

/*
 * PrimeirasAulas.HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */
public class HelloWorld {
  public static void main(String[] args) {

    /*
     * Números (int, double, float, long)
     * Texto (string)
     * Booleanos (boolean)
     */

    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 3.14;
    float dadoDoTipoFloat = 3.14f;
    long dadoDoTipoLong = 3190829037182731092L;
    String dadoDoTipoString = "Colocar o meu texto";
    boolean dadoDoTipoBoolean = false;

    //if - else
    // if(dadoDoTipoInt == 10) {
    //   //sysout
    //   System.out.println("Entrou no if do 10");
    // } else if(dadoDoTipoInt == 12) {
    //   System.out.println("Entrou no if do 12");
    // } else {
    //   System.out.println("Entrou no else");
    // }


    // while
    int valorInicial = 0;

    while(valorInicial < 3) {
      System.out.println("O valor inicial é menor que 3");
      System.out.println(valorInicial);
      valorInicial++;
    }
    System.out.println("Saiu do while");

    // for

    System.out.println("Iniciando o loop FOR");
    for(int i = 0; i < 4; i++) {
      System.out.println("O valor de i é: " + i);
    }
    System.out.println("Finalizando o loop FOR");
  }
}