package com.Pomodoro.App.Models.Dtos;

// essa classe e um Dto (data transfer object)
//ela serve para que o Springboot saiba o que fazer com o Json recebido
//comunicando o front ao controllador com o uso dessa classe.

//use a annotation @JsonProperty("nome no JSon") para todas as variaveis.

import com.fasterxml.jackson.annotation.JsonProperty;

public class CycleInfo
{
    @JsonProperty("Username")
    String Username;

    @JsonProperty("CycleName")
    String CycleName;

    @JsonProperty("CycleId")
    String CycleId;

    @JsonProperty("CycleConclusion")
    boolean CycleConclusion;


    public boolean isCycleConclusion() {
        return CycleConclusion;
    }

    public void setCycleConclusion(boolean cycleConclusion) {
        CycleConclusion = cycleConclusion;
    }

    public String getCycleId() {
        return CycleId;
    }

    public void setCycleId(String cycleId) {
        CycleId = cycleId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getCycleName() {
        return CycleName;
    }

    public void setCycleName(String cycleName) {
        CycleName = cycleName;
    }

}
