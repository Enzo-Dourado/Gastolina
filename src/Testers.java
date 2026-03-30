import br.com.projeto.gastolina.models.chamadas.ConsumoDaAPI;

import java.util.Scanner;

public class Testers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
//        consumo.consumoDaAPI();
        consumo.consumoDaAPIParaChamarModeloDoVeiculo();
    }
}
