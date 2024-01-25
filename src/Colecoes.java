import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Bryan", 10);
    notas.put("Joaquim", 6);
    notas.put("Pedro", 5);
    notas.put("Lorena", 1);
    notas.put("André", 8);

//    var nota = notas.get("Pedro");
    for(Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é: " + key + "e o valor é: " + value);
    }

  }
}
