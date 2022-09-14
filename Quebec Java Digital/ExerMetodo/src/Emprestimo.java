import java.security.PublicKey;
import java.sql.SQLOutput;

public class Emprestimo {

    public static void emprestar(double valor, int parcelas) {
        if (parcelas == 1) {
            System.out.println(" O valor final do emprestimo é: " + valor);
        } else if (parcelas >= 2 && parcelas <= 4) {
            double valorfinal = valor + (valor * 0.3);
            System.out.printf("O valor final do emprestimo para " + valorfinal);
        } else if (parcelas >= 5 && parcelas <= 10) {
            double valorfinal = valor + (valor * 0.5);
            System.out.printf("O valor final do emprestimo para " + valorfinal);
        } else {
            System.out.println("Quantidade de parcelas errada!");
        }
    }
}