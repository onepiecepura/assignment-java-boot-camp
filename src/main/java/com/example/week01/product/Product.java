package com.example.week01.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product{
	@Id
	private int id;
	private String name;
	private String description;
	private String category;
	private String brand;
	private double price;

	public Product() {
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
