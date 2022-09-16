import java.nio.DoubleBuffer;
import java.util.*;

public class manSet {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 esta no conjunto:");
        boolean existe = notas.contains(5d);
        if (existe = true){
            System.out.println("Existe");
        }else {
            System.out.println("Não existe");
        }

        System.out.println("Exiba a menor nota:\n" + Collections.min(notas));

        System.out.println("Exiba a maior nota:\n" + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a media das notas:\n" + soma / notas.size());

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2.toString());

        System.out.println("Exiba as notas na ordem crescente ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3.toString());

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas);

    }
}
