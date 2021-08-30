package com.c2s.transfer;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private String name;
    private String type;
    private String validation;
    private String value;
    private String label;
    private List<Validator> validadores;



    public Field (){
        validadores = new ArrayList<>();
        name="nombre";
    }

    public void addValidator(Validator v ){
        validadores.add(v);
    }


    public List<Validator> getValidadores() {
        return validadores;
    }

    public void setValidadores(List<Validator> validadores) {
        this.validadores = validadores;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }
}
