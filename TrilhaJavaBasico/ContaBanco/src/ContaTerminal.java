import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, informe o número da Agência");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe seu nome");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, informe o sado");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
