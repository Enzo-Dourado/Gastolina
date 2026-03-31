package br.com.projeto.gastolina.models.superclass;

import br.com.projeto.gastolina.records.IdDasMarcas;
import br.com.projeto.gastolina.records.IdDosAnosDosModelos;
import br.com.projeto.gastolina.records.IdDosModelos;

public class Veiculos {
    private int idMarcaVeiculo;
    private String tipoVeiculo;
    private String modeloVeiculo;
    private int idModeloVeiculo;
    private int anoVeiculo;
    private String detalhesVeiculo;
    private double consumoPorLitroVeiculo;

    public Veiculos(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Veiculos(IdDasMarcas idDasMarcas) {
        this.idMarcaVeiculo = Integer.parseInt(idDasMarcas.code());
        this.tipoVeiculo =  idDasMarcas.name();
    }

    public Veiculos(IdDosModelos idDosModelos) {
        this.idModeloVeiculo = Integer.parseInt(idDosModelos.code());
        this.modeloVeiculo = idDosModelos.name();
    }

    public Veiculos(IdDosAnosDosModelos idDosAnosDosModelos) {
        this.anoVeiculo = Integer.parseInt(idDosAnosDosModelos.code());
        this.tipoVeiculo =  idDosAnosDosModelos.name();
    }

    public int getIdModeloVeiculo() {
        return idModeloVeiculo;
    }

    public void setIdModeloVeiculo(int idModeloVeiculo) {
        this.idModeloVeiculo = idModeloVeiculo;
    }

    public double getConsumoPorLitroVeiculo() {
        return consumoPorLitroVeiculo;
    }

    public void setConsumoPorLitroVeiculo(double consumoPorLitroVeiculo) {
        this.consumoPorLitroVeiculo = consumoPorLitroVeiculo;
    }

    public void setIdMarcaVeiculo(int idMarcaVeiculo) {
        this.idMarcaVeiculo = idMarcaVeiculo;
    }

    public int getIdMarcaVeiculo() {
        return idMarcaVeiculo;
    }


    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public String getDetalhesVeiculo() {
        return detalhesVeiculo;
    }

    @Override
    public String toString() {
        return "{Id: " + idMarcaVeiculo +
                ", Nome: " + tipoVeiculo + "}";
    }

}
