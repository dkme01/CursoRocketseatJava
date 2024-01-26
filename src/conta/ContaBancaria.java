package conta;

public class ContaBancaria {
  private String numero;
  private String titular;
  private double saldo;

  //  Getters e Setters

  public ContaBancaria() {
    saldo = 0.0;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getNumero() {
    return numero;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getTitular() {
    return titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  //  depositar
  void depositar(double valor) {
    if(valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito de R$" + valor + " realizado. Saldo atualizado: R$" + saldo);
    } else {
      System.out.println("Não é possível realizar um depósito sem valor");
    }
  }

  //  sacar
  void sacar(double valor) {
    if(valor > 0 && saldo >= valor) {
      saldo = saldo - valor;
      System.out.println("Saque de R$" + valor + " realizado. Saldo atualizado: R$" + saldo);
    } else {
      System.out.println("Não é possível realizar um saque maior que o saldo atual");
    }
  }
}
