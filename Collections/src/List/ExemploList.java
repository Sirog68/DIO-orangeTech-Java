package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        // List notas = new ArrayList(); //Antes do java 5
        // List<Double> notas = new ArrayList<>(); // Generic (jdk 5) - Diamond Operator (jdk 7)
        // ArrayList<Double> notas =  new ArrayList<>();
        // List <Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // notas.add(10d);
        // System.out.println(notas);

        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // notas.add(1d);
        // notas.remove(5d);
        // System.out.println(notas);

        System.out.println("Crie uma lista e inclua as 7 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());


        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicone à lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("\nVerifique se a nota 5.0 encontra-se na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que fora incluidas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota da lista: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota da lista: " + Collections.min(notas));
        
        System.out.println("\nExiba a maior nota da lista: " + Collections.max(notas));

        //System.out.println("\nExiba a soma de todas as notas: " );
        var iterator = notas.iterator();
        Double somaNota = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            somaNota += next;
        }
        System.out.println("\nExiba a soma das notas: " + somaNota ); 

        System.out.println("\nExiba a média das notas: " + (somaNota / notas.size()));

        System.out.println("\nExclua a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nExclua a  nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nExclua a notas menores que 7.0 e exiba a lista: ");

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7.0) iterator2.remove();
            /*
             * Quando temos apenas uma condição como abaixo
             * podemos escrever como acima
             * 
             * if (next < 7.0) {
                    iterator2.remove();
                }
             */
            }
        System.out.println(notas);

        System.out.println("\nExclua toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());


    }
}
