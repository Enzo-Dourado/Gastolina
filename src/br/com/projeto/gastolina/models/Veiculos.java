package br.com.projeto.gastolina.models;

public class Veiculos {
    private int idMarcaVeiculo;
    private String tipoVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private String detalhesVeiculo;

    public int getIdMarcaVeiculo() {
        return idMarcaVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
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
}
