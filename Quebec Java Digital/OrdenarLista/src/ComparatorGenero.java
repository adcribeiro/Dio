import java.util.Comparator;
import java.util.Set;

public class ComparatorGenero implements Comparator<Series> {
    @Override
    public int compare(Series s1, Series s2) {
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        return genero;
    }
}
