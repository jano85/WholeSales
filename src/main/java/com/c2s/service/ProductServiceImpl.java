package com.c2s.service;

import com.c2s.controller.ProductBean;
import com.c2s.transfer.BaseTo;
import com.c2s.transfer.ProductDetailTo;
import com.c2s.transfer.ProductTo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger logger = LogManager.getLogger(ProductServiceImpl.class);

    @Override
    public ProductTo insertarProducto(ProductTo prod) {
        logger.debug("insertarProducto");
        RestTemplate restTemplate = new RestTemplate();
        logger.debug("insert");
        List<ProductTo> nuevos = new ArrayList<>();
        ProductTo p = new ProductTo();
        ProductDetailTo d = new ProductDetailTo();
        d.setCategory("categoriaXXX");
        List<ProductDetailTo> detalles = new ArrayList();
        detalles.add(d);
        p.setNombre(prod.getNombre());
        p.setDetails(detalles);
        p.setKeyAttribute(prod.getNombre());
        nuevos.add(p);
        BaseTo s=null;
        try {
            String url = "http://localhost:8095/create";

            s = restTemplate.postForObject(url,nuevos, BaseTo.class);

        } catch (HttpClientErrorException.NotFound ex) {
            s = null;
        }
        logger.debug(s);



        return null;
    }
}
