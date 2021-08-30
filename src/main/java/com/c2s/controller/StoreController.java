package com.c2s.controller;

import com.c2s.transfer.*;
import com.fasterxml.jackson.core.type.TypeReference;

import org.apache.logging.log4j.Logger;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.apache.logging.log4j.LogManager;
import java.util.*;

@Controller


public class StoreController {

    private RestTemplate restTemplate=new RestTemplate();
    private static final Logger logger = LogManager.getLogger(StoreController.class);
   /* @RequestMapping("/store")
    public String homePage(Model model) {
        logger.debug("debug1");
        logger.warn("debug2");
        logger.info("debug3");
        Store u = new Store();
        model.addAttribute("store", u);
        return "store";
    }*/

//
//    @RequestMapping("/store")
//    public String indexPage(Model model) {
//        //BaseTo base=null;
//        System.out.println("store");
//        System.out.println(model);
//        Store u = new Store();
//        model.addAttribute("store", u);
//        List<Store> tiendas = new LinkedList<>();
//
////        Optional<ProductTo> s;
////        try {
////            s = restTemplate.getForObject("http://localhost:8095/get/1744", Optional.class);
////        } catch (HttpClientErrorException.NotFound ex)   {
////            s = null;
////        }
//
////        System.out.println(s);
////        for (int i=0;i<20;i++){
////            u = new Store();
////            u.setName("n"+i);
////            tiendas.add(u);
////        }
//
//
////        model.addAttribute("stores", tiendas);
//
//        return "store";
//    }
//
//    @RequestMapping("/storeP")
//    public ResponseEntity pagination(@RequestParam(required = false) Integer start ,
//                                     @RequestParam(required = false) Integer draw,
//                                     @RequestParam(required = false) Integer length,
//                                     @RequestParam(value = "search[value]", required = false ) String search) {
//
//        System.out.println("storeP");
//        System.out.println(start);
//        System.out.println(draw);
//        System.out.println(length);
//        System.out.println(search);
//
//        PaginationData s;
//        try {
//            String url = "http://localhost:8095/pagina?number="+draw+"&size="+length;
//            System.out.println(url);
//            s = restTemplate.getForObject(url, PaginationData.class);
//        } catch (HttpClientErrorException.NotFound ex)   {
//            s = null;
//        }
//
//        System.out.println(s.getContent());
//
//
//        Store u = new Store();
//        List<Store> tiendas = new LinkedList<>();
//        int i= start == null? 0: 10* start;
//        int j=0;
//        while (j<10){
//            u = new Store();
//            u.setName("n"+i++);
//            tiendas.add(u);
//            j++;
//        }
//
//
//        Pagination p = new Pagination();
//        p.setData(tiendas);
//        p.setDraw(draw);
//        p.setRecordsFiltered(50);
//        p.setRecordsTotal(50);
//        return ResponseEntity.ok(p);
//    }
//
//    @PostMapping(value = "/ajaxStore")
//    public String ajaxStore(@ModelAttribute("store") Store st) {
//        System.out.println("ajaxStore");
//        System.out.println(st);
//        return "store";
//    }
//    @RequestMapping(value = "/registerStore")
//    public String registrar(@ModelAttribute("store") Store st) {
//        System.out.println("PST!");
//        System.out.println(st);
//
//        /*
//        {
//            "keyAttribute" : "last",
//            "nombre":"nombre",
//            "details":[{
//                        "ean13":"155",
//                        "category":"cat",
//                        "description":"33333"
//                        }]
//        }
//        * */
//        RestTemplate restTemplate = new RestTemplate();
//
////        String reqBody = "{   {\n" +
////                "            \"keyAttribute\" : \"last\",\n" +
////                "            \"nombre\":\"nombre\",\n" +
////                "            \"details\":[{\n" +
////                "                        \"ean13\":\"155\",\n" +
////                "                        \"category\":\"cat\",\n" +
////                "                        \"description\":\"33333\"\n" +
////                "                        }]\n" +
////                "        }}";
////        System.out.println(reqBody);
////        restTemplate.put("localhost:8095/create",reqBody);
//
//
////        Map<String, String> params= new HashMap<String, String>();
////       // params.put("id","10");
////        HttpHeaders headers = new HttpHeaders();
////        HttpB
////      //  headers.set("X-TP-DeviceID", Global.deviceID);
////        ProductTo prod= new ProductTo();
////        HttpEntity<ProductTo> requestEntity = new HttpEntity<ProductTo>(prod, headers);
////        HttpEntity<ProductTo[]> response  = restTemplate.exchange("localhost:8095/create", HttpMethod.PUT, requestEntity, ProductTo[].class, params);
////       System.out.println( response.getBody());
//
//        HttpHeaders requestHeaders = new HttpHeaders();
//        //set up HTTP Basic Authentication Header
//       // requestHeaders.add("Authorization", authorizationHeader);
//        requestHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
//        //request entity is created with request headers
//        HttpEntity<ProductTo> requestEntity = new HttpEntity<>(requestHeaders);
//        ProductTo p = new ProductTo();
//        p.setNombre("nombreDePrueba");
//        p.setKeyAttribute((new Date()).getTime()+"");
//        ProductDetailTo dp = new ProductDetailTo();
//        dp.setEan13("98898797");
//        dp.setDescription("descrip");
//        dp.setCategory("cat1");
//        LinkedList<ProductDetailTo> detail =  new LinkedList<ProductDetailTo>();
//        detail.add(dp);
//        p.setDetails(detail);
//        HttpEntity<ProductTo> request = new HttpEntity<ProductTo>(p);
//
//        ResponseEntity<BaseTo> responseEntity = restTemplate.exchange("http://localhost:8095/create", HttpMethod.PUT, request, BaseTo.class);
//
//        if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            System.out.println("response received");
//            System.out.println(responseEntity.getBody());
//        }
//        if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
//            System.out.println("CREADO");
//              System.out.println(responseEntity.getBody().toString());
//
//            BaseTo resp1= responseEntity.getBody();
//
//
//            ObjectMapper mapper = new ObjectMapper();
//            List<ProductTo> pos = mapper.convertValue(resp1.getData(), new TypeReference<List<ProductTo>>() { });
//
//
//
//
//            System.out.println("CREADO FIN");
//
////            JSONObject personJsonObject = new JSONObject(responseEntity.getBody());
////            System.out.println(personJsonObject);
//        }
//        return "store";
//    }
//
//    /*
//        public void makeApiCall(){
//        final String uri = "https://searchEmployee...";
//        RestTemplate restTemplate = new RestTemplate();
//        String reqBody = "{"city": "Ranchi"}";
//        String result = restTemplate.postForObject(uri, reqBody, String.class);
//        // convert your result into json
//        try {
//                    jsonResponse = new JSONObject(result);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//       //extract a value "name" from your json data:
//       try{
//        String value = jsonResponse.getString("name");
//        }catch(JSONException e) {
//                e.printStackTrace();
//            }
//        }
//    */
}
