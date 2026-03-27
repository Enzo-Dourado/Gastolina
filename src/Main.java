import br.com.projeto.gastolina.models.ChamarGson;
import br.com.projeto.gastolina.models.ConsumoDaAPI;
import br.com.projeto.gastolina.models.superclass.Veiculos;
import br.com.projeto.gastolina.records.IdDasMarcas;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChamarGson gson = new ChamarGson();
        List<Veiculos> idAndMarcasDeVeiculos = new ArrayList<>();
        String entrarNaApi;


        while (true) {
            System.out.print("Digite que tipo de veiculo quer analisar (cars, motorcycles, trucks): ");
             entrarNaApi = sc.next();


            if (entrarNaApi.equalsIgnoreCase("cars") ||
                    entrarNaApi.equalsIgnoreCase("motorcycles") ||
                    entrarNaApi.equalsIgnoreCase("trucks")) {
                break;
            } else {
                System.out.println("Tipo digitado não aceito, tente novamente...");
            }

        }

        ConsumoDaAPI consumo = new ConsumoDaAPI(entrarNaApi);
        consumo.consumoDaAPI();

        gson.chamaGson();
        // Converte o Json em um Array
        JsonArray jsonArray = gson.getGson().fromJson(consumo.getJson(), JsonArray.class);

        for (var elementos : jsonArray) {
            IdDasMarcas marca = gson.getGson().fromJson(elementos, IdDasMarcas.class);
            Veiculos veiculo = new Veiculos(marca);
            System.out.println(veiculo);
        }

    }
}
