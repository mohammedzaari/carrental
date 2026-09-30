package ma.zaari.car.app.services;

import java.util.List;

import ma.zaari.car.app.models.Vehicle;

public interface VehicleService {
	public boolean registerVehicle(Vehicle v);
	public List<Vehicle> getVehicles();
	public Vehicle getVehicle(int id);
	public boolean updateVehicle(Vehicle v);
	public void archiveVehicle(int id);
}
