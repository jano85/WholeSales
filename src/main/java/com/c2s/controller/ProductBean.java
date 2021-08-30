package com.c2s.controller;


import com.c2s.service.ProductService;
import com.c2s.transfer.Pagination;
import com.c2s.transfer.PaginationData;
import com.c2s.transfer.ProductTo;
import com.c2s.transfer.Store;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.faces.view.ViewScoped;
import java.util.LinkedList;
import java.util.List;

@Component
@ViewScoped
public class ProductBean {
    private static final Logger logger = LogManager.getLogger(ProductBean.class);
    private static final String base = "/store";

    private RestTemplate restTemplate = new RestTemplate();
    private ProductTo productoNew = new ProductTo();
    private ProductTo productoEdit;


    @Autowired
    private ProductService productService;

    public ProductTo getProductoNew() {
        return productoNew;
    }

    public void setProductoNew(ProductTo productoNew) {
        this.productoNew = productoNew;
    }

    public ProductTo getProductoEdit() {
        return productoEdit;
    }

    public void setProductoEdit(ProductTo productoEdit) {
        this.productoEdit = productoEdit;
    }

    public String insert() {
        logger.debug(productoNew.getNombre());
        productService.insertarProducto(productoNew);
        productoNew.setNombre("");
        return "";
    }
}

@Controller
class MyController{
    private static final Logger logger = LogManager.getLogger(ProductBean.class);
    private RestTemplate restTemplate = new RestTemplate();
@RequestMapping("/datagrid")
public ResponseEntity getdata(@RequestParam(required = false) Integer start,
                              @RequestParam(required = false) Integer draw,
                              @RequestParam(required = false) Integer length,
                              @RequestParam(value = "search[value]", required = false) String search) {

    logger.debug("getdata");
    logger.debug("start: "+start);
    logger.debug("length: "+length);
    logger.debug("search: "+search);
    String filter="";
    if(search!=null && search.length()>0){
        filter="&filter="+search;
        start=0;
        length=10;
    }
    PaginationData s;
    int page = start/length;
    try {
        String url = "http://localhost:8095/data?page=" + page + "&size=" + length+filter;
        logger.debug(url);
        s = restTemplate.getForObject(url, PaginationData.class);

    } catch (HttpClientErrorException.NotFound ex) {
        s = null;
    }
    List<Store> tiendas = new LinkedList<>();
    int total = 0;
    if (s != null) {
        s.getContent().forEach(tmp -> {
            Store u = new Store();
            u.setName(tmp.getNombre());
            tiendas.add(u);
        });
        total = s.getTotalElements();
    }
    Pagination p = new Pagination();
    p.setData(tiendas);
    p.setDraw(draw);
    p.setRecordsFiltered(total);
    p.setRecordsTotal(total);

    logger.debug(tiendas.size());
    return ResponseEntity.ok(p);
}
}