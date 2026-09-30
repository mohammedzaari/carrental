package ma.zaari.car.app.models;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	private String pickupLocation;
	private String returnLocation;
	private String status;
	private double totalPrice;
	private LocalDateTime createdAt;
	public Reservation(LocalDate startDate, LocalDate endDate, String pickupLocation, String returnLocation,
			String status, double totalPrice) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.pickupLocation = pickupLocation;
		this.returnLocation = returnLocation;
		this.status = status;
		this.totalPrice = totalPrice;
		this.createdAt = LocalDateTime.now();
	}
	public Reservation() {
		this(LocalDate.parse("22/09/2026",DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("01/10/2026",DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"pickupLocation","return","status",345 );
	}
	public Reservation(int id, LocalDate startDate, LocalDate endDate, String pickupLocation, String returnLocation,
			String status, double totalPrice, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pickupLocation = pickupLocation;
		this.returnLocation = returnLocation;
		this.status = status;
		this.totalPrice = totalPrice;
		this.createdAt = createdAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getReturnLocation() {
		return returnLocation;
	}
	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}
