package br.com.projeto.gastolina;

import br.com.projeto.gastolina.loops.AnoDoVeiculoPeloModeloLoop;
import br.com.projeto.gastolina.loops.ModeloDeVeiculoLoop;
import br.com.projeto.gastolina.loops.TipoDeVeiculoLoop;
import br.com.projeto.gastolina.models.superclass.Veiculos;

import java.util.Scanner;

public class ChamarPrograma {
    public void rodaPrograma() {
        String funcionalidades;
        int rodarPrograma;

        Scanner sc = new Scanner(System.in);
        Veiculos veiculo = new Veiculos();
        TipoDeVeiculoLoop tipoDeVeiculoLoop = new TipoDeVeiculoLoop(veiculo.getTipoVeiculo());
        ModeloDeVeiculoLoop modeloDeVeiculoLoop = new ModeloDeVeiculoLoop(veiculo.getModeloVeiculo());
        AnoDoVeiculoPeloModeloLoop anoDoVeiculoPeloModeloLoop = new AnoDoVeiculoPeloModeloLoop(veiculo.getIdAnoVeiculo());

        System.out.println("** Bem-Vindo ao Gastolina **");
        System.out.println("\nConheça nossas funcionalidades...");

        funcionalidades = """
                        
                                =====   FUNCIONALIDADES   =====
                ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** **
                            1 - Tipos de veiculos trabalhados (Marcas)
                            2 - Conhecer os modelos dos veiculos
                            3 - Ano e modelos dos veiculos
                            0 - sair 
                ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** **
                
                """;

        while (true) {
            System.out.println(funcionalidades);
            System.out.print("\nDigite a funcionalidade que deseja de acordo com os numeros passado: ");
            rodarPrograma = sc.nextInt();

            if (rodarPrograma == 0) {
                System.out.println("Fim do programa.");
                break;
            }

            switch (rodarPrograma) {
                case 1: {
                    tipoDeVeiculoLoop.chamaTipoDeVeiculo();
                    break;
                }
                case 2: {
                    modeloDeVeiculoLoop.chamaModeloDeVeiculo();
                    break;
                }
                case 3: {
                    anoDoVeiculoPeloModeloLoop.chamaAnoModeloDoVeiculo();
                    break;
                }
                default: {
                    System.out.println("Desconhecido, digite novamente!");
                    break;
                }
            }
        }
    }
}
