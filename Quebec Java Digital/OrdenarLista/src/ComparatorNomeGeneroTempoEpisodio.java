import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());

        if (nome != 0){
            return nome;
        } else if (genero != 0) {
            return genero;
        }return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
