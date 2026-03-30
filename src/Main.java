import br.com.projeto.gastolina.models.chamadas.ChamarGson;
import br.com.projeto.gastolina.models.chamadas.ConsumoDaAPI;
import br.com.projeto.gastolina.models.superclass.Veiculos;
import br.com.projeto.gastolina.records.IdDasMarcas;
import com.google.gson.JsonArray;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrarNaApi;
        int buscarVeiculo;


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

        while (true) {
            System.out.println("\n** Em caso de duvida dos ID, digite 0 para analisar **\n");
            System.out.print("Digite o ID da Marca do Veiculo que você deseja buscar: ");
            buscarVeiculo = sc.nextInt();

            if (buscarVeiculo == 0) {
                ChamarGson gson = new ChamarGson();
                gson.chamaGson();
                // Converte o Json em um Array
                JsonArray jsonArray = gson.getGson().fromJson(consumo.getJson(), JsonArray.class);

                for (var elementos : jsonArray) {
                    IdDasMarcas marca = gson.getGson().fromJson(elementos, IdDasMarcas.class);
                    Veiculos veiculo = new Veiculos(marca);
                    System.out.println(veiculo);
                }
            } else if (buscarVeiculo > 0) {
                System.out.println("\nBuscando informações...\n");
                consumo.setIdMarcaVeiculo(buscarVeiculo);
                break;

            } else {
                System.out.println("Valor digitado não aceito, tente novamente...");
            }

        }

        consumo.consumoDaAPIParaChamarModeloDoVeiculo();
    }
}
