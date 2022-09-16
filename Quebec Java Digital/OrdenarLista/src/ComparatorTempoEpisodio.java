import java.util.Comparator;
public class ComparatorTempoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series s1, Series s2) {
         return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
    }
}
