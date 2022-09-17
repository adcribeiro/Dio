import java.util.*;

public class man {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("------------------------------------------");

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println("------------------------------------------");

        System.out.println("confira se o modelo tucson esta no dicionario");
        Boolean contem = carrosPopulares.containsKey("tucson");
        System.out.println(contem);
        System.out.println("------------------------------------------");

        System.out.printf("Exiba o consumo do uno\n" + carrosPopulares.get("uno"));
        System.out.println("------------------------------------------");

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("------------------------------------------");

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("------------------------------------------");

        System.out.printf("Exiba o modelo mais economico e seu consumo");
        Double ConsumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(ConsumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("\n" + modeloMaisEficiente + " > " + ConsumoMaisEficiente);
            }
        }
        System.out.println("------------------------------------------");


        System.out.printf("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("\n" + modeloMenosEficiente + " > " + consumoMenosEficiente);
            }
        }
        System.out.println("------------------------------------------");

        System.out.println("Exiba a soma dos soncumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("------------------------------------------");

        System.out.printf("Exiba a media dos consumos deste dicionario de carros: \n" + soma / carrosPopulares.size());
        System.out.println("------------------------------------------");

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();;
        }
        System.out.println(carrosPopulares);
        System.out.println("------------------------------------------");

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());
        System.out.println("------------------------------------------");

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("------------------------------------------");

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println("------------------------------------------");

        System.out.println("Confira se o dicionario esta vazio:\n " + carrosPopulares.isEmpty());



    }
}
