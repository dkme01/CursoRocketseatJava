package excecoes;

public class Excecoes {
  //  Checked exceptions
  public static void validarNumero() throws Exception {
    int numero = 200;

    if(numero < 100) {
      throw new Exception("O número não é maior que 100");
    }
  }
  //  Unchecked exceptions


  public static void main(String[] args) throws Exception {
//    try {
//    validarNumero();
//    } catch(Exception error){
//      System.out.println("Erro");
//      error.printStackTrace();
//    }
  }
}
