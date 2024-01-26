package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();

    pessoa1.cpf = "12345678910";
    pessoa1.nome = "Jubileu";
    pessoa1.idade = 25;

    System.out.println(pessoa1.imprimirDadosPessoa(1));

    Pessoa pessoa2 = new Pessoa();

    pessoa2.cpf = "12345678910";
    pessoa2.nome = "Louro José";
    pessoa2.idade = 80;

    System.out.println(pessoa2.imprimirDadosPessoa(2));

  }
}
