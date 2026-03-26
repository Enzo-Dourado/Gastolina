import br.com.projeto.gastolina.models.ChamarGson;
import br.com.projeto.gastolina.models.ConsumoDaAPI;
import br.com.projeto.gastolina.records.IdDasMarcas;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsumoDaAPI consumo = new ConsumoDaAPI();
        ChamarGson gson = new ChamarGson();

        while (true) {
            System.out.println("Digite que tipo de veiculo quer analisar (cars, motorcycles, trucks): ");
            consumo.setTipoVeiculo(sc.next());

            if (consumo.getTipoVeiculo().equalsIgnoreCase("cars") ||
                    consumo.getTipoVeiculo().equalsIgnoreCase("motorcycles") ||
                    consumo.getTipoVeiculo().equalsIgnoreCase("trucks")) {
                break;
            } else {
                System.out.println("Tipo digitado não aceito, tente novamente...");
            }

        }
        consumo.consumoDaAPI();

        IdDasMarcas[] marcas = gson.getGson().fromJson(consumo.getJson(), IdDasMarcas[].class);
        for(IdDasMarcas marca : marcas) {
            System.out.println("Id Marca: " + marca.code() + " || Nome Marca: " + marca.name());
        }

    }
}
