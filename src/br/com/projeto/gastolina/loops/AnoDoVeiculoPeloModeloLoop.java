package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.chamadas.ConsumoDaAPI;
import br.com.projeto.gastolina.models.superclass.Veiculos;
import br.com.projeto.gastolina.records.IdDosAnosDosModelos;

import java.util.Scanner;


public class AnoDoVeiculoPeloModeloLoop extends Veiculos {

    private int anoVeiculoLoop;

    public AnoDoVeiculoPeloModeloLoop(IdDosAnosDosModelos idDosAnosDosModelos) {
        super(idDosAnosDosModelos);
    }

    public int getAnoVeiculoLoop() {
        return anoVeiculoLoop;
    }

    public void setAnoVeiculoLoop(int anoVeiculoLoop) {
        this.anoVeiculoLoop = anoVeiculoLoop;
    }


    public void chamaAnoModeloDoVeiculo() {
        ModeloDeVeiculoLoop loopModeloVeiculo = new ModeloDeVeiculoLoop(getModeloVeiculo());
        loopModeloVeiculo.chamaModeloDeVeiculo();

        while (true) {
            Scanner sc =  new Scanner(System.in);
            System.out.println("Digite o ano que deseja pesquisar: ");
            setAnoVeiculoLoop(sc.nextInt());
            ConsumoDaAPI consumoDaAPI = new ConsumoDaAPI(getAnoVeiculoLoop());
            consumoDaAPI.consumoDaAPIParaChamarAnoDoVeiculo();
        }

    }
}
