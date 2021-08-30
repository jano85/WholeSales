package com.c2s.transfer;

import java.util.Date;
import java.util.List;


public class ProductTo {


	private Long id;


	private String nombre;

	private String description;

	private String ean13;

	private String category;

	private String keyAttribute;

	private String atribute1;

	private String atribute2;

	private String atribute3;

	private String atribute4;

	private String message;
	private int code;

	private List<ProductDetailTo> details;


	public List<ProductDetailTo> getDetails() {
		return details;
	}

	public void setDetails(List<ProductDetailTo> details) {
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getKeyAttribute() {
		return keyAttribute;
	}


	public void setKeyAttribute(String keyAttribute) {
		this.keyAttribute = keyAttribute;
	}




	public String getCategory() {
		return category;
	}


public ProductTo() {
	// TODO Auto-generated constructor stub
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	@Override
	public String toString() {
		return "ProductTo{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", description='" + description + '\'' +
				", ean13='" + ean13 + '\'' +
				", category='" + category + '\'' +
				", keyAttribute='" + keyAttribute + '\'' +
				", atribute1='" + atribute1 + '\'' +
				", atribute2='" + atribute2 + '\'' +
				", atribute3='" + atribute3 + '\'' +
				", atribute4='" + atribute4 + '\'' +
				", message='" + message + '\'' +
				", code=" + code +
				", details=" + details +
				", createAt=" + createAt +
				'}';
	}
}
