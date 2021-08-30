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
public class LoginBean {
    private static final Logger logger = LogManager.getLogger(ProductBean.class);
    private static final String base = "/store";





    public String login() {
        logger.debug("login");

        return "";
    }

    public String register() {
        logger.debug("register");

        return "";
    }
}


