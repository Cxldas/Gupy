import java.util.HashMap;
import java.util.Map;

public class Quarto {
    public static void main(String[] args) {

        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);


        double total = 0;
        for (double valor : faturamento.values()) {
            total += valor;
        }


        Map<String, Double> percentuais = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / total) * 100;
            percentuais.put(estado, percentual);
        }


        for (Map.Entry<String, Double> entry : percentuais.entrySet()) {
            String estado = entry.getKey();
            double percentual = entry.getValue();
            System.out.printf("%s: %.2f%%%n", estado, percentual);
        }
    }
}
