package pessoa;

public class Aluno extends Pessoa {
  private String matricula;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String imprimirDadosPessoa() {
    return super.imprimirDadosPessoa() + ", você é aluno e sua matricula é " + matricula;
  }
}
