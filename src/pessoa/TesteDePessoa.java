package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setCpf("001001001");
    pessoa.setNome("Jubileu");
    pessoa.setIdade(25);

    System.out.println(pessoa.imprimirDadosPessoa());

    Professor professor = new Professor();

    professor.setCpf("002002002");
    professor.setNome("Louro José");
    professor.setIdade(60);
    professor.setSalario(50000);

    System.out.println(professor.imprimirDadosPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("003003003");
    aluno.setNome("Tiringa");
    aluno.setIdade(17);
    aluno.setMatricula("83839292");

    System.out.println(aluno.imprimirDadosPessoa());

  }
}
