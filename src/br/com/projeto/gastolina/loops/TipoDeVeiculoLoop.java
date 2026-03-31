package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.superclass.Veiculos;
import java.util.Scanner;

public class TipoDeVeiculoLoop extends Veiculos {

    private String entrarNaApi;

    public TipoDeVeiculoLoop(String tipoVeiculo) {
        super(tipoVeiculo);
    }

    public String getEntrarNaApi() {
        return entrarNaApi;
    }

    public void setEntrarNaApi(String entrarNaApi) {
        this.entrarNaApi = entrarNaApi;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }
}
