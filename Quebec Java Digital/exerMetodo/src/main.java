import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois numeros");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        Calculadora.soma(num1,num2);
        Calculadora.divisão(num1,num2);
        Calculadora.multiplicacao(num1,num2);
        Calculadora.subtracao(num1,num2);

        System.out.println("Informe as horas");
        double hora = sc.nextDouble();

        Mensagem.horaDia(hora);
    }
}
