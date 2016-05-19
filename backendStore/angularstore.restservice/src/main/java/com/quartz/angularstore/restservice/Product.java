package com.quartz.angularstore.restservice;

import java.util.List;

public class Product {
	public Product(String name, String description, Integer shine, Double price, Integer rarity, String color,
			Integer faces, List<String> images, List<String> reviews) {
		
		this.name = name;
		this.description = description;
		this.shine = shine;
		this.price = price;
		this.rarity = rarity;
		this.color = color;
		this.faces = faces;
		this.images = images;
		this.reviews = reviews;
	}
	private  String name;
	private  String description;
	private  Integer shine;
	private  Double price;
	private  Integer rarity;
	private  String color;
	private  Integer faces;
	private List<String> images;
	private List<String> reviews;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<String> getReviews() {
		return reviews;
	}
	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}
	public Integer getShine() {
		return shine;
	}
	public void setShine(Integer shine) {
		this.shine = shine;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getFaces() {
		return faces;
	}
	public void setFaces(Integer faces) {
		this.faces = faces;
	}
	
	

	
}
