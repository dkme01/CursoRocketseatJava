import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
  public static void main(String[] args) {
    // lista
    List<String> nomes = new ArrayList<>();
    nomes.add("Bryan");
    nomes.add("Mike");
    nomes.add("John");
    nomes.add("Paul");

    /*System.out.println(nomes.get(0));
    for(String nome : nomes) {
      System.out.println("O nome é " + nome);
    }*/

    /*nomes.forEach(nome -> System.out.println("O nome é "+nome));*/
    nomes.forEach(System.out::println);

  }
}
