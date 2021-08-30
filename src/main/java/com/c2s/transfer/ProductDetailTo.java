package com.c2s.transfer;

import java.util.Date;

public class ProductDetailTo {

    private Long id;

    private String ean13;

    private String description;

    private String category;

    private String atribute1;

    private String atribute2;

    private String atribute3;

    private String atribute4;


    private ProductTo product;


    public ProductTo getProduct() {
        return product;
    }

    public void setProduct(ProductTo product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAtribute1() {
        return atribute1;
    }

    public void setAtribute1(String atribute1) {
        this.atribute1 = atribute1;
    }

    public String getAtribute2() {
        return atribute2;
    }

    public void setAtribute2(String atribute2) {
        this.atribute2 = atribute2;
    }

    public String getAtribute3() {
        return atribute3;
    }



    public void setAtribute3(String atribute3) {
        this.atribute3 = atribute3;
    }



    public String getAtribute4() {
        return atribute4;
    }



    public void setAtribute4(String atribute4) {
        this.atribute4 = atribute4;
    }



    public String getEan13() {
        return ean13;
    }



    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }


    private Date createAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


}

