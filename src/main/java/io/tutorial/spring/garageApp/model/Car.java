package io.tutorial.spring.garageApp.model;

public class Car {
	
	public enum Color {
		RED,
		BLUE,
		GREEN,
		YELLOW
	}
	
	private long id;
	private String model;
	private String brand;
	private int year;
	public Color color;
	
	/**
	 * Constructeur vide
	 */
	public Car() {
		
	}
	
	/**
	 * @param id
	 * @param model
	 * @param brand
	 * @param year
	 * @param color
	 */
	public Car(long id, String model, String brand, int year, Color color) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.color = color;
	}
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
