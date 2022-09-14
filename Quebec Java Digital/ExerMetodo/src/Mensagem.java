public class Mensagem {


    public static void horaDia(double horas){
        if (horas >= 5 && horas <=12){
            System.out.println(" Bom dia !");
        }else if(horas >= 13 && horas <= 17 ){
            System.out.println("Boa tarde!");

        }else if(horas >=18 && horas <=23){
            System.out.println("Boa noite!");
        }else{
            System.out.printf("Hora Invalida");
        }
    }
}
