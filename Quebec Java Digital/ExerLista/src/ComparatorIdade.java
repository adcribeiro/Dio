import java.util.Comparator;

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if (nome != 0) {
            return nome;
        } else if (cor != 0) {
            return cor;
        } else {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}


