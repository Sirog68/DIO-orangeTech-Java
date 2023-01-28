package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColletionsSet {
	public static void main(String[] args) {
	// Dada uma lista com 7 notas de um aluno [ 7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
	
	// Set notas = new HashSet(); //antes do java 5
	// Set<Double> notas = new HashSet<>(); // Generics (jdk 5) - Diamont Operator (jdk 7)
	// HashSet<Double> notas =  new HashSet<>();
	// Set<Double> notas = Set.of(7d,8.5, 9.3, 5d, 7d, 0d, 3.6);
	// notas.add(1d);
	// notas.remove(5d);
	// System.out.println(notas);
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		//System.out.println("Exiba a posição da nota 5.0 : ");
		//em Set não temos como exibir a posição (index.of) de um elemento dentro da lista
		
		//System.out.println("Adicione à lista a nota 8d na posição 4: ");
		//idem acima não há a possibilidade de trabalhar com posição dentro do set
		
		//System.out.println("Substitua a nota 5d pela nota 6d");
		//TB não temos como realizar este procedimento
		
		System.out.println("\nConfira se a nota 5d está no conjunto : " + notas.contains(5d));
		
		//System.out.println("\nExiba a terceira nota adicionada: ");
		//não temos o método get para o mm
		
		System.out.println("\nExiba a menor nota: " + Collections.min(notas));
		
		System.out.println("\nExiba a maior nota: " + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		
		while (iterator.hasNext()) {
			Double next = (Double) iterator.next();
			soma += next;
			
		}
		System.out.println("\nExiba a soma das notas: " + soma);
		
		System.out.println("\nExiba a média das notas: "+ (soma/notas.size()));
		
		System.out.println("\nRemova a nota 0d: ");
		notas.remove(0d);
		System.out.println(notas);
		
		//System.out.println("Remova a nota da posição 0: ");
		// não temos como trabalhar com indice no set
		
		System.out.println("Remova as notas menores que 7 e exita a lista: ");
		Iterator<Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			Double next = (Double) iterator2.next();
			if (next < 7) iterator2.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d); // não duplica
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println("\nnotas 2 : " + notas2);
		
		System.out.println("\nExiba todas as notas em ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		
		System.out.println("\nExclua todo o conjunto: ");
		notas.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
		
		System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
	}
}