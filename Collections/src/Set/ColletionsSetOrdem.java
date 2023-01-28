package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColletionsSetOrdem {
    public static void main(String[] args) {
        
        System.out.println("\n--\tOrdem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comédia", 25));
        }};
        
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - "  + serie.getDuracaoEpisodio()+ " min " );
        }

        System.out.println("\n--\tOrdem de Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comédia", 25));
        }};
        
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - "  + serie.getDuracaoEpisodio()+ " min " );
        }


        System.out.println("\n--\tOrdem Natural (duracaoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - "  + serie.getDuracaoEpisodio()+ " min " );
        }

        System.out.println("\n--\tOrdem nome/Gênero/duração Episódio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroDuracao());

        minhasSeries3.addAll(minhasSeries);
        
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoEpisodio() + " min");
        }
    }
}

