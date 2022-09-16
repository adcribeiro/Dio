import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class manOrdenaLista {
    public static void main(String[] args) {

        System.out.println("Ordem Aleatoria");
        Set<Series> minhasSeries = new HashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie : minhasSeries)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();

        System.out.println("Ordem de inserção");
        Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (
                Series serie : minhasSeries1)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println();


        System.out.println("Ordem Natural(tempo de episodio");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (
                Series serie : minhasSeries2)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());




    }
}
