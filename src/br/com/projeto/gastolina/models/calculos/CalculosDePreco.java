package br.com.projeto.gastolina.models.calculos;

import br.com.projeto.gastolina.models.superclass.Veiculos;

public class CalculosDePreco {
    private double precoGasolina;
    private double precoGasolinaAdtivada;
    private double precoDiesel;
    private double precoAlcool;

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoGasolinaAdtivada() {
        return precoGasolinaAdtivada;
    }

    public void setPrecoGasolinaAdtivada(double precoGasolinaAdtivada) {
        this.precoGasolinaAdtivada = precoGasolinaAdtivada;
    }

    public double getPrecoDiesel() {
        return precoDiesel;
    }

    public void setPrecoDiesel(double precoDiesel) {
        this.precoDiesel = precoDiesel;
    }

    public double getPrecoAlcool() {
        return precoAlcool;
    }

    public void setPrecoAlcool(double precoAlcool) {
        this.precoAlcool = precoAlcool;
    }

    public double calculaPrecoDeAcordoComConsumoDoVeiculo(Veiculos veiculo) {
        precoAlcool = 4.89 * veiculo.getConsumoPorLitroVeiculo();
        return precoAlcool;
    }
}
