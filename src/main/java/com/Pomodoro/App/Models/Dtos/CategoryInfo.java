package com.Pomodoro.App.Models.Dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryInfo
{

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCategoryname(String categoryname) {
        Categoryname = categoryname;
    }

    public String getName_sub_category() {
        return name_sub_category;
    }

    public void setName_sub_category(String name_sub_category) {
        this.name_sub_category = name_sub_category;
    }

    public int getDay_challenge() {
        return day_challenge;
    }

    public void setDay_challenge(int day_challenge) {
        this.day_challenge = day_challenge;
    }

    String Categoryname;
    String name_sub_category;
    int day_challenge;


    String CategoryId;
    String color;


}
