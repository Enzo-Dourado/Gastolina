package br.com.projeto.gastolina.models;

import br.com.projeto.gastolina.records.IdDasMarcas;

public class Veiculos {
    private int idMarcaVeiculo;
    private String tipoVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private String detalhesVeiculo;
    private double consumoPorLitroVeiculo

    public double getConsumoPorLitroVeiculo() {
        return consumoPorLitroVeiculo;
    }

    public void setConsumoPorLitroVeiculo(double consumoPorLitroVeiculo) {
        this.consumoPorLitroVeiculo = consumoPorLitroVeiculo;
    }

    public Veiculos() {}

    public Veiculos(IdDasMarcas code, IdDasMarcas name) {
        this.idMarcaVeiculo = Integer.parseInt(code.code());
        this.tipoVeiculo = name.name();
    }


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
