package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramArray {
    
    public static void main(String[] args) {
        // Listas POO Testando varias formas
		//não github
		List<String>list = new ArrayList<>();
		
		list.add("Maria" );//inserir elementos na lista
		list.add("Alex" );
		list.add("Bob" );
		list.add("Anna" );
		list.add(2, "Marco");
		
		System.out.println(list.size());//Tamanho da lista
		//list.remove(1);(uma opção de remoção)
		for(String x :list) {
			System.out.println(x);
		}// testando
		System.out.println("------------------");//Remoção(obj)(int)(predicato)
		list.removeIf(x -> x.charAt(0)== 'M');
		for(String x :list) {
			System.out.println(x);
		}// testando
      System.out.println("----------------");//Encontrar posições de elementos
      System.out.println("Index of Bob: "+ list.indexOf("Bob"));
      System.out.println("Index of Marco: "+ list.indexOf("Marco"));
      System.out.println("---------------------------------");//filtrar lista c/ base no predicato
      List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
      for(String x : result ) {
    	  System.out.println(x);
      }//testando
      System.out.println("-------------------");//Encontrar primeira ocorrencia c/ base em predicato
      String name = list.stream().filter(x -> x.charAt(0)== 'J').findFirst().orElse(null);
      System.out.println(name);

    }
}
