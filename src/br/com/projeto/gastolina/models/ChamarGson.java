package br.com.projeto.gastolina.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ChamarGson {
    private Gson gson;

    public Gson getGson() {
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson;
    }
}
