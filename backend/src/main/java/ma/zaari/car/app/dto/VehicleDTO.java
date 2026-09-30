package ma.zaari.car.app.dto;

import ma.zaari.car.app.enumarations.VehicleStatus;

public class VehicleDTO {
	private String brand;
	private String model;
	private String Color;
	private int numberOfSeats;
	private VehicleStatus status;
	
	public VehicleDTO(String brand, String model, String color, int numberOfSeats, VehicleStatus status) {
		super();
		this.brand = brand;
		this.model = model;
		Color = color;
		this.numberOfSeats = numberOfSeats;
		this.status = status;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public VehicleStatus getStatus() {
		return status;
	}
	public void setStatus(VehicleStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "VehicleDTO [brand=" + brand + ", model=" + model + ", Color=" + Color + ", numberOfSeats="
				+ numberOfSeats + ", status=" + status + "]";
	}
	
	
	
}
