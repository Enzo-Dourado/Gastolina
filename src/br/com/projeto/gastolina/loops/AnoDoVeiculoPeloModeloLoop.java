package br.com.projeto.gastolina.loops;

import br.com.projeto.gastolina.models.superclass.Veiculos;
import java.util.Scanner;

public class AnoDoVeiculoPeloModeloLoop extends Veiculos {

    // Atributos
    private int anoVeiculoLoop;

    // Construtores
    public AnoDoVeiculoPeloModeloLoop(String idDosAnosDosModelos) {
        super(idDosAnosDosModelos);
    }

    // Getters
    public int getAnoVeiculoLoop() {
        return anoVeiculoLoop;
    }

    // Setters
    public void setAnoVeiculoLoop(int anoVeiculoLoop) {
        this.anoVeiculoLoop = anoVeiculoLoop;
    }

    // Metodos
    public void chamaAnoModeloDoVeiculo() {
        ModeloDeVeiculoLoop loopModeloVeiculo = new ModeloDeVeiculoLoop(getModeloVeiculo());
        loopModeloVeiculo.chamaModeloDeVeiculo();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o ano que deseja pesquisar: ");
            setIdAnoVeiculo(sc.nextLine());


            if (getAnoVeiculoLoop() == 0) {
                break;
            } else {
                System.out.println("Digite novamente");
            }

        }
    }
}
