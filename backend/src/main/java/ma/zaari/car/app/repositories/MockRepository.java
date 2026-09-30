package ma.zaari.car.app.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.zaari.car.app.enumarations.VehicleStatus;
import ma.zaari.car.app.models.Vehicle;

@Repository
public class MockRepository {
	@Autowired
	private List<Vehicle> vehicles;
	
	public List<Vehicle> getVehicles(){
		return this.vehicles;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	public Vehicle getByID(int id) {
		return this.vehicles.stream().filter(v -> v.getId()==id ).findFirst().get();
	}
	public boolean update(Vehicle v) {
		this.vehicles.set(0, v);
		return true;
	}
	public boolean updateStatus(int id,VehicleStatus vStatus) {
		return true;
	}
	public boolean updateMileage(int id,long mileage) {
		return true;
	}
	public String historyOfStatus(int id) {
		return "history of vehicle";
	}
	public boolean addImages(int id,String... images) {
		return true;
	}
}
