package ma.zaari.car.app.models;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import ma.zaari.car.app.enumarations.VehicleStatus;

/*int id;int registrationNumber;String brand;String model;int year;String color;String fuelType;String transmission;String numberOfSeats;long mileage
 * VehicleStatus;Date dailyPrice;Date description;createdAt:updateAt
 * */
@Entity
@Table(name = "vehicles")
public class Vehicle {
	@Id
	@GeneratedValue
	private int id;
	private int registrationNumber;
	private String brand;
	private String model;
	private int year;
	private String color;
	private String fuelType;
	private String transmission;
	private int numberOfSeats;
	private long mileage;
	private VehicleStatus status;
	private double dailyPrice;
	private String description;
	
	public Vehicle() {
		
	}

	public Vehicle(int registrationNumber, String brand, String model, int year, String color, String fuelType,
	        String transmission, int numberOfSeats, long mileage, VehicleStatus status, double dailyPrice,
	        String description) {
	    super();
	    this.registrationNumber = registrationNumber;
	    this.brand = brand;
	    this.model = model;
	    this.year = year;
	    this.color = color;
	    this.fuelType = fuelType;
	    this.transmission = transmission;
	    this.numberOfSeats = numberOfSeats;
	    this.mileage = mileage;
	    this.status = status;
	    this.dailyPrice = dailyPrice;
	    this.description = description;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public long getMileage() {
		return mileage;
	}

	public void setMileage(long mileage) {
		this.mileage = mileage;
	}

	public VehicleStatus getStatus() {
		return status;
	}

	public void setStatus(VehicleStatus status) {
		this.status = status;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
