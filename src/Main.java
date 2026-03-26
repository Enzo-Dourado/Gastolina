import br.com.projeto.gastolina.models.ConsumoDaAPI;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsumoDaAPI consumo = new ConsumoDaAPI();

        System.out.println("Digite que tipo de veiculo quer analisar (cars, motorcycles, trucks): ");
        consumo.setTipoVeiculo(sc.next());
        consumo.consumoDaAPI();

    }

}
