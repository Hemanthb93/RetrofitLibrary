package com.example.hemanthkumar.retrofit;

/**
 * Created by hemanthkumar on 2/11/17.
 */

public class Hero {

    private String Title;
    private String Intro;
    private String Description;
    private String Running_time;
    private String Country;

    public Hero(String title, String intro, String description, String running_time, String country) {
        Title = title;
        Intro = intro;
        Description = description;
        Running_time = running_time;
        Country = country;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getIntro() {
        return Intro;
    }

    public void setIntro(String intro) {
        Intro = intro;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getRunning_time() {
        return Running_time;
    }

    public void setRunning_time(String running_time) {
        Running_time = running_time;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}