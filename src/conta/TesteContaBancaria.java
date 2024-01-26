package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria contaBancaria1 = new ContaBancaria();
    ContaBancaria contaBancaria2 = new ContaBancaria();

    contaBancaria1.setNumero("1234");
    contaBancaria1.setTitular("José");

    contaBancaria2.setNumero("5678");
    contaBancaria2.setTitular("Pedro");

    contaBancaria1.depositar(100);
    contaBancaria1.sacar(150);

    contaBancaria2.depositar(200);
    contaBancaria2.sacar(70);
  }
}
