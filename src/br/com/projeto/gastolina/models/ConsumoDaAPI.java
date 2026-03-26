package br.com.projeto.gastolina.models;

import br.com.projeto.gastolina.records.IdDasMarcas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoDaAPI extends Veiculos{
    private String url;
    private String json;

    public ConsumoDaAPI() {}
    public ConsumoDaAPI(IdDasMarcas code, IdDasMarcas name) {
        super(code, name);
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

            this.json = response.body();

        }  catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
