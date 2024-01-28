package pessoa;

public class Professor extends Pessoa {

  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  //  sobreescreveu o método da classe mãe (Pessoa)
  public String imprimirDadosPessoa() {
    return super.imprimirDadosPessoa() + ", você é professor e seu salário é " + salario;
  }

}
