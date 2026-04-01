package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.chamadas.ChamarGson;
import br.com.projeto.gastolina.models.chamadas.ConsumoDaAPI;
import br.com.projeto.gastolina.models.superclass.Veiculos;
import br.com.projeto.gastolina.records.IdDasMarcas;
import br.com.projeto.gastolina.records.IdDosModelos;
import com.google.gson.JsonArray;

import java.util.Scanner;

public class ModeloDeVeiculoLoop extends Veiculos {
    // Atributos
    private int buscarVeiculo;

    // Contrutores
    public ModeloDeVeiculoLoop(String modeloVeiculo) {
        super(modeloVeiculo);
    }
    public ModeloDeVeiculoLoop (IdDosModelos idDosModelos) {
        super(idDosModelos);
    }

    // Getters
    public int getBuscarVeiculo() {
        return buscarVeiculo;
    }

    // Setters
    public void setBuscarVeiculo(int buscarVeiculo) {
        this.buscarVeiculo = buscarVeiculo;
    }

    // Metodos
    public void chamaModeloDeVeiculo() {
        TipoDeVeiculoLoop loopTipoVeiculo =  new TipoDeVeiculoLoop(getTipoVeiculo());
        loopTipoVeiculo.chamaTipoDeVeiculo();

        ConsumoDaAPI consumo = new ConsumoDaAPI(loopTipoVeiculo.getEntrarNaApi());
        consumo.consumoDaAPI();

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n** Em caso de duvida dos ID, digite 0 para analisar **\n");
            System.out.print("Digite o ID da Marca do Veiculo que você deseja buscar: ");
            setBuscarVeiculo(sc.nextInt());

            if (getBuscarVeiculo() == 0) {
                ChamarGson gson = new ChamarGson();
                gson.chamaGson();
                // Converte o Json em um Array
                JsonArray jsonArray = gson.getGson().fromJson(consumo.getJson(), JsonArray.class);

                for (var elementos : jsonArray) {
                    IdDasMarcas marca = gson.getGson().fromJson(elementos, IdDasMarcas.class);
                    Veiculos veiculo = new Veiculos(marca);
                    System.out.println(veiculo);
                }
            } else if (getBuscarVeiculo() > 0) {
                System.out.println("\nBuscando informações...\n");
                consumo.setIdMarcaVeiculo(getBuscarVeiculo());
                break;

            } else {
                System.out.println("Valor digitado não aceito, tente novamente...");
            }
        }
        consumo.consumoDaAPIParaChamarModeloDoVeiculo();
    }

    @Override
    public String toString() {
        return "{Id do Veículo: " + getIdModeloVeiculo() +
                "Nome do Veículo: " + getModeloVeiculo() + "}";
    }
}
