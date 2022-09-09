public class quadrilateros {

    public static double area(double lado1) {
        return lado1 * lado1;

    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        return ((baseMenor + baseMaior) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }


}



