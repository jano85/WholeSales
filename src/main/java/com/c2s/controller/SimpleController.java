package com.c2s.controller;

import com.c2s.transfer.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class SimpleController {
    private static final Logger logger = LogManager.getLogger(SimpleController.class);
    private static final String base = "/store";
    private RestTemplate restTemplate = new RestTemplate();


//    @PostMapping(base + "/insert")
//    public ResponseEntity insert(@RequestParam(required = false) String name, Model model) {
//        logger.debug("insert");
//        List<ProductTo> nuevos = new ArrayList<>();
//        ProductTo p = new ProductTo();
//        ProductDetailTo d = new ProductDetailTo();
//        d.setCategory("categoriaXXX");
//        List<ProductDetailTo> detalles = new ArrayList();
//        detalles.add(d);
//        p.setNombre(name);
//        p.setDetails(detalles);
//        p.setKeyAttribute(name);
//        nuevos.add(p);
//        BaseTo s=null;
//        try {
//            String url = "http://localhost:8095/create";
//
//            s = restTemplate.postForObject(url,nuevos, BaseTo.class);
//
//        } catch (HttpClientErrorException.NotFound ex) {
//            s = null;
//        }
//       logger.debug(s);
//        return  ResponseEntity.ok(s);
//    }
//
//    @GetMapping(base + "/modify")
//    public String modify(Model model) {
//        logger.debug("modify");
//        model.addAttribute("respuesta", "Algo");
//        return "resp2";
//    }
//
//    @GetMapping(base + "/delete")
//    public String delete(Model model) {
//        logger.debug("delete");
//        model.addAttribute("respuesta", "Algo");
//        return "store";
//    }
//
//


}