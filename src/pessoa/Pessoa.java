package pessoa;

public class Pessoa {
//  nome, idade, cpf
//  tipo nomeDaVariavel

  String nome;
  int idade;
  String cpf;

  String imprimirDadosPessoa(int indice) {
    return "O nome da pessoa é " + nome + " a idade é " + idade + " e o cpf é " + cpf + " e o indice é " + indice;
  }
}
