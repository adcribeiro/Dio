public class Calculadora {

    public static void  soma(double num1, double num2){
        double result = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é :" + result);
    }

    public static void  subtracao(double num1, double num2){
        double result = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " é :" + result);
    }

    public static void  multiplicacao(double num1, double num2){
        double result = num1 * num2;
        System.out.println("A multiplicação de "+ num1 + " *  " + num2 + " é :" + result);
    }

    public static void divisão(double num1, double num2){
        double result = num1 / num2;
    System.out.println("A divisão de " + num1 + " - " + num2 + " é: " + result);
    }
}
