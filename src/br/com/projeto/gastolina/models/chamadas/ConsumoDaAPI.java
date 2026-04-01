package br.com.projeto.gastolina.models.chamadas;

import br.com.projeto.gastolina.models.superclass.Veiculos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoDaAPI extends Veiculos {
    // Atributos
    private String url;
    private String json;

    // Construtores
    public ConsumoDaAPI(String tipoVeiculo) {
        super(tipoVeiculo);
    }

    // Getters
    public String getUrl() {
        this.url = "https://fipe.parallelum.com.br/api/v2/" + getTipoVeiculo() + "/brands";
        return url;
    }
    public String getJson() {
        return json;
    }

    // Setters
    public void setUrl(String url) {
        this.url = url;
    }
    public void setJson(String json) {
        this.json = json;
    }

    // Metodos
    public void consumoDaAPI(){
        // Consome a API FIPE
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(getUrl()))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            setJson(response.body());

        }  catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void consumoDaAPIParaChamarModeloDoVeiculo() {
        setUrl("https://fipe.parallelum.com.br/api/v2/" + getTipoVeiculo() + "/brands/" +
                getIdMarcaVeiculo() + "/models/");

        consumoDaAPI();
        System.out.println(getJson());
    }

    public void consumoDaAPIParaChamarModeloDaMarcaDoVeiculo() {
        setUrl("https://fipe.parallelum.com.br/api/v2/" + getTipoVeiculo() + "/brands/" +
                getIdMarcaVeiculo() + "/models/" + getIdModeloVeiculo());

        consumoDaAPI();
        System.out.println(getJson());
    }
    public void consumoDaAPIParaChamarAnoDoVeiculo(){
        setUrl("https://fipe.parallelum.com.br/api/v2/" + getTipoVeiculo() + "/brands/" +
                getIdMarcaVeiculo() + "/models/" + getIdModeloVeiculo() + "/years/" + getIdAnoVeiculo());

        consumoDaAPI();
        System.out.println(getJson());
    }
}
