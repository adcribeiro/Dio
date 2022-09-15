import java.util.*;

public class ProgramOrdenarLista {
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

        System.out.println("Ordem Nome");
        Collections.sort(meuGatos);
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }
        System.out.println();
        System.out.println("Ordem Idade");
        Collections.sort(meuGatos, new ComparatorIdade());
        //meuGatos.sort(new ComparatorIdade());
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }

        System.out.println();
        System.out.println("Ordem por Cor:");
        meuGatos.sort(new ComparatorCor());
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }

        System.out.println();
        System.out.println("Ordem Nome/Cor/Idade");
        //Collections.sort(meuGatos, new ComparatorNomeCorIdade());
        meuGatos.sort(new ComparatorNomeCorIdade());
        for (Gato gatos : meuGatos) {
            System.out.println(gatos);
        }

    }
}



