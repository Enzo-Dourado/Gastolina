package br.com.projeto.gastolina.models.chamadas;

import br.com.projeto.gastolina.models.superclass.Veiculos;
import br.com.projeto.gastolina.records.IdDasMarcas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoDaAPI extends Veiculos {
    private String url;
    private String json;

    public ConsumoDaAPI(String tipoVeiculo) {
        super(tipoVeiculo);
    }
    public ConsumoDaAPI(IdDasMarcas idDasMarcas) {
        super(idDasMarcas);
    }

    public String getUrl() {
        this.url = "https://fipe.parallelum.com.br/api/v2/" + getTipoVeiculo() + "/brands";
        return url;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

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

    public void consumoDaAPIParaChamarModeloDoVeiculo(){
       this.url = getUrl() + "/" +  "59" + "/models";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            setJson(response.body());
            System.out.println(getJson());

        }  catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
