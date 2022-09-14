import java.util.*;

public class ExeOrdenarLista {
    public static void main(String[] args) {

        List<Gato> meuGatos = new ArrayList<>();
        meuGatos.add(new Gato("john", 18, "Preto"));
        meuGatos.add(new Gato("Simba", 6, "tigrado"));
        meuGatos.add(new Gato("john", 12, "amarelo"));

        System.out.println("Ordem de inserção");
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }
        System.out.println();

        System.out.println("Ordem aleatória");
        Collections.shuffle(meuGatos);
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }
        System.out.println();

        System.out.println("Ordem natural(Nome)");
        Collections.sort(meuGatos);
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }

    }

    static class Gato implements Comparable<Gato> {
        private String nome;
        private Integer idade;
        private String cor;

        public Gato(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());

        }
    }
}


