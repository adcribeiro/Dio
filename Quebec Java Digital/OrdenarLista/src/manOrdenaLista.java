import javax.sql.rowset.serial.SerialRef;
import java.util.*;

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
        System.out.println("-----------------------------------");

        System.out.println("Ordem de inserção");
        Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie : minhasSeries1)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("-----------------------------------");


        System.out.println("\bOrdem Natural(tempo de episodio\b");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Series serie : minhasSeries2)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("-----------------------------------");

        System.out.println("\bOrdem Nome/Genero/TempoEpisodio\b");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Series serie : minhasSeries3)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("----------------------------------");

        System.out.println(" Ordem por Genero");
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Series serie : minhasSeries4)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("-----------------------------------");

        System.out.println("Ordenar por tempo de Episodio");
        Set<Series> minhaSeries5 = new TreeSet<>(minhasSeries);
        for (Series serie : minhaSeries5)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
