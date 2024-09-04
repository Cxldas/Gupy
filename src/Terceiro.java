import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FaturamentoMensal {
    public static void main(String[] args) {
        try {

            JsonArray faturamentoMensal = JsonParser.parseReader(new FileReader("faturamento.json")).getAsJsonArray();

            List<Double> valores = new ArrayList<>();
            double soma = 0.0;
            int diasComFaturamento = 0;

            for (JsonElement elemento : faturamentoMensal) {
                JsonObject diaFaturamento = elemento.getAsJsonObject();
                double valor = diaFaturamento.get("valor").getAsDouble();


                if (valor > 0.0) {
                    valores.add(valor);
                    soma += valor;
                    diasComFaturamento++;
                }
            }

            double menorFaturamento = Collections.min(valores);
            double maiorFaturamento = Collections.max(valores);
            double mediaMensal = soma / diasComFaturamento;


            int diasAcimaDaMedia = 0;
            for (double valor : valores) {
                if (valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
