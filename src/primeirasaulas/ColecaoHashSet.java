package primeirasaulas;

import java.util.HashSet;

public class ColecaoHashSet {
  public static void main(String[] args) {
    HashSet<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);
    numeros.add(14);
    numeros.add(15);

//    numeros.remove(12);
//
//    for(Integer numero : numeros) {
//      System.out.println(numero);
//    }

    System.out.println(numeros.contains(14));
  }
}
