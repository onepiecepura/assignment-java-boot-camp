package com.example.week01.product;

public class ProductDetailResponse{
	private int id;
	private String name;
	private String description;
	private String category;
	private String brand;
	private double price;
	private String image;
	private int size;

	public ProductDetailResponse() {
	}

	public ProductDetailResponse(Product product) {
		this.setId(product.getId());
		this.setName(product.getName());
		this.setDescription(product.getDescription());
		this.setCategory(product.getCategory());
		this.setBrand(product.getBrand());
		this.setPrice(product.getPrice());
		this.setImage(product.getImage());
		this.setSize(product.getSize());
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}
}
