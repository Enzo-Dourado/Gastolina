package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.chamadas.ConsumoDaAPI;
import br.com.projeto.gastolina.models.superclass.Veiculos;

public class AnoDoVeiculoPeloModeloLoop extends Veiculos {

    public AnoDoVeiculoPeloModeloLoop(String tipoVeiculo) {
        super(tipoVeiculo);
    }

    public void chamaAnoModeloDoVeiculo() {
        ModeloDeVeiculoLoop modelo = new ModeloDeVeiculoLoop();
        modelo.chamaModeloDeVeiculo();

    }
}
