package br.com.projeto.gastolina.models.superclass;

import br.com.projeto.gastolina.records.IdDasMarcas;

public class Veiculos {
    private int idMarcaVeiculo;
    private String tipoVeiculo;
    private String modeloVeiculo;
    private int IdModeloVeiculo;
    private int anoVeiculo;
    private String detalhesVeiculo;
    private double consumoPorLitroVeiculo;

    public int getIdModeloVeiculo() {
        return IdModeloVeiculo;
    }

    public void setIdModeloVeiculo(int idModeloVeiculo) {
        IdModeloVeiculo = idModeloVeiculo;
    }


    public Veiculos(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public double getConsumoPorLitroVeiculo() {
        return consumoPorLitroVeiculo;
    }

    public void setConsumoPorLitroVeiculo(double consumoPorLitroVeiculo) {
        this.consumoPorLitroVeiculo = consumoPorLitroVeiculo;
    }


    public Veiculos(IdDasMarcas idDasMarcas) {
        this.idMarcaVeiculo = Integer.parseInt(idDasMarcas.code());
        this.tipoVeiculo =  idDasMarcas.name();

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
