package data.structure;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class estruturaMap {
    public static void main(String[] args) {

        // Map carrosPopulares2020 = new HashMap(); // antes do java 5
        // Map<String, Double> carrosPopulares2020 = new HashMap<>();
        // HashMap<String, Double> carrosPopulares = new HashMap<>();
        // Map<String, Double> carrosPopulares = Map.of("gol", 14.4, "uno", 15.6);

        // Crie um dicionário
        Map<String, Double> carrosPopulares2020 = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };

        System.out.println(carrosPopulares2020.toString());

        // substitua o consumo do gol
        carrosPopulares2020.put("gol", 15.2);
        System.out.println(carrosPopulares2020.toString());

        // o modelo tompson está no dicionário?
        System.out.println(carrosPopulares2020.containsKey("tompson"));

        // exiba o consumo do uno
        System.out.println(carrosPopulares2020.get("uno"));

        // exiba o terceiro modelo adicionado
        // não há como

        // exiba os modelos
        Set<String> modelos = carrosPopulares2020.keySet();
        System.out.println(modelos);

        // exiba o consumo dos carros
        Collection<Double> consumos = carrosPopulares2020.values();
        System.out.println(consumos);

        // retornar o carro mais economico
        System.out.println(Collections.max(carrosPopulares2020.values()));

        // exiba o modelo mais economico e seu consumo
        Set<Map.Entry<String, Double>> entries = carrosPopulares2020.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(Collections.max(carrosPopulares2020.values()))) {
                System.out.println("Modelo mais eficiente é: " + entry.getKey());
            }
        }

        // modelo menos econômico e seu consumo
        Double menosEconomico = Collections.min(carrosPopulares2020.values());
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue() == menosEconomico) {
                System.out.println("Modelo menos eficiente é: " + entry.getKey() + " com: " + menosEconomico + "km/L");
            }
        }

        // exiba a soma dos consumos
        Double soma = 0d;
        for (Map.Entry<String, Double> entry : entries) {
            soma += entry.getValue();
        }
        System.out.println("Soma: " + soma);

        // exiba a média
        Double media = soma / carrosPopulares2020.size();
        System.out.println("Media: " + media);

        // Remova os modelos com o consumo igual a 15.6
        Iterator<Double> it = carrosPopulares2020.values().iterator();
        while (it.hasNext()) {
            if (it.next() == 15.6) {
                it.remove();
            }
        }
        System.out.println(consumos);

        // exiba todos os carros na ordem em que foram informados
        Map<String, Double> newCarrosPopulares2020 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(newCarrosPopulares2020.toString());

        // exiba ordenado pelo modelo
        Map<String, Double> carrospop = new TreeMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrospop.toString());
    }
}
