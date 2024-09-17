import javax.naming.SizeLimitExceededException;
import javax.swing.text.DefaultEditorKit;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//         analisarCandidato(1900.0);
//         analisarCandidato(2200.0);
//         analisarCandidato(2000.0);


        selecaoCandidatos();
        System.out.println("");
        imprimirSelecionado();

        System.out.println();
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGSUTO" };
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativasRealizadas < 3 );

        if (atendeu)
            System.out.println("CONSEGIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionado() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGSUTO" };

        System.out.println("Imprimindo lista de candidatos informando posição");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println();

        System.out.println("Forma abreviada de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");

        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");

        }

    }
}
