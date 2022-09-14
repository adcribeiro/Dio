import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe lado1, lado2, autura, baseMenor, baseMaior, diagonal1, diagonal2");

        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double altura = sc.nextDouble();
        double baseMenor = sc.nextDouble();
        double baseMaior = sc.nextDouble();
        float diagonal1 = sc.nextFloat();
        float diagonal2 = sc.nextFloat();


        System.out.println("Quadrado: " + quadrilateros.area(lado1));
        System.out.println("Retângulo: " + quadrilateros.area(lado1,lado2));
        System.out.println("trapézio: " + quadrilateros.area(baseMenor,baseMaior,altura));
        System.out.println("losango: " + quadrilateros.area(diagonal1,diagonal2));

    }
}
