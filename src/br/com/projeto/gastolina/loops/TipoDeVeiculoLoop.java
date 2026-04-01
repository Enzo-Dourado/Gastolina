package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.superclass.Veiculos;
import java.util.Scanner;

public class TipoDeVeiculoLoop extends Veiculos {
    // Atributos
    private String entrarNaApi;

    // Construtores
    public TipoDeVeiculoLoop(String tipoVeiculo) {
        super(tipoVeiculo);
    }

    // Getters
    public String getEntrarNaApi() {
        return entrarNaApi;
    }

    // Setters
    public void setEntrarNaApi(String entrarNaApi) {
        this.entrarNaApi = entrarNaApi;
    }

    // Metodos
    public void chamaTipoDeVeiculo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite que tipo de veiculo quer analisar (cars, motorcycles, trucks): ");
            setEntrarNaApi(sc.nextLine());

            if (entrarNaApi.equalsIgnoreCase("cars") ||
                    entrarNaApi.equalsIgnoreCase("motorcycles") ||
                    entrarNaApi.equalsIgnoreCase("trucks")) {
                break;
            } else {
                System.out.println("Tipo digitado não aceito, tente novamente...");
                System.out.print("Digite que tipo de veiculo quer analisar (cars, motorcycles, trucks): ");
            }
        }
    }
}
