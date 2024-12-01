package org.example.sonadrive.model;

import lombok.*;


public class Country {
    private int id;
    private String isoCode;

    public Country() {
    }

    public Country(int id, String isoCode) {
        this.id = id;
        this.isoCode = isoCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
}

