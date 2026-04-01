package br.com.projeto.gastolina.models.superclass;

import br.com.projeto.gastolina.records.IdDasMarcas;
import br.com.projeto.gastolina.records.IdDosAnosDosModelos;
import br.com.projeto.gastolina.records.IdDosModelos;

public class Veiculos {
    // Atributos
    private int idMarcaVeiculo;
    private String tipoVeiculo;
    private String modeloVeiculo;
    private int idModeloVeiculo;
    private int anoVeiculo;
    private String idAnoVeiculo;
    private String detalhesVeiculo;
    private double consumoPorLitroVeiculo;

    // Construtores
    public Veiculos(){}

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
        this.idAnoVeiculo = idDosAnosDosModelos.code();
        this.tipoVeiculo =  idDosAnosDosModelos.name();
    }

    // Getters
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public int getIdMarcaVeiculo() {
        return idMarcaVeiculo;
    }
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }
    public int getIdModeloVeiculo() {
        return idModeloVeiculo;
    }
    public int getAnoVeiculo() {
        return anoVeiculo;
    }
    public String getIdAnoVeiculo() {
        return idAnoVeiculo;
    }
    public String getDetalhesVeiculo() {
        return detalhesVeiculo;
    }
    public double getConsumoPorLitroVeiculo() {
        return consumoPorLitroVeiculo;
    }

    // Setters
    public void setIdMarcaVeiculo(int idMarcaVeiculo) {
        this.idMarcaVeiculo = idMarcaVeiculo;
    }
    public void setIdModeloVeiculo(int idModeloVeiculo) {
        this.idModeloVeiculo = idModeloVeiculo;
    }
    public void setIdAnoVeiculo(String idAnoVeiculo) {
        this.idAnoVeiculo = idAnoVeiculo;
    }
    public void setConsumoPorLitroVeiculo(double consumoPorLitroVeiculo) {
        this.consumoPorLitroVeiculo = consumoPorLitroVeiculo;
    }

    // Metodos
    @Override
    public String toString() {
        return "{Id: " + idMarcaVeiculo +
                ", Nome: " + tipoVeiculo + "}";
    }

}
