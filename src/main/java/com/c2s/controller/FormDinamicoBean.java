package com.c2s.controller;


import com.c2s.transfer.Field;
import com.c2s.transfer.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@Component
@ViewScoped
public class FormDinamicoBean {
    private static final Logger logger = LogManager.getLogger(FormDinamicoBean.class);
    private List<Field> fields;

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public String init(){
         logger.debug("init");
         fields = new ArrayList<Field>();
         Field f = new Field();
         f.setName("Nombre");
         f.setType("TEXT");
        f.setLabel("Nombre");
        Validator v = new Validator();
        v.setMinimo(5);
        v.setMinimoEnable(true);
        f.addValidator(v);
         fields.add(f);

         f = new Field();
        f.setName("Rut");
        f.setLabel("Rut");
        f.setType("TEXT");
        v = new Validator();
        v.setMinimo(0);
        v.setMinimoEnable(false);
        f.addValidator(v);
        fields.add(f);




         return "init";
    }

    public String login() {
        logger.debug("login");
        fields.stream().forEach( e -> {
           logger.debug(e.getValue());
        });
        return "";
    }
    public String register() {
        logger.debug("register");
        return "";
    }
}


