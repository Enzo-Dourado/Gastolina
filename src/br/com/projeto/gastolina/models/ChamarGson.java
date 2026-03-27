package br.com.projeto.gastolina.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ChamarGson {
    private Gson gson;

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public Gson getGson() {
        return gson;
    }

    public void chamaGson() {
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }
}
