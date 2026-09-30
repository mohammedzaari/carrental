package ma.zaari.car.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.zaari.car.app.models.Vehicle;
import ma.zaari.car.app.repositories.VehicleRepository;

@Service
public class DefaultVehicleService implements VehicleService{
	
	private VehicleRepository repository;
	public DefaultVehicleService(VehicleRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public boolean registerVehicle(Vehicle v) {
		return repository.save(v)!=null?true:false;
	}
	@Override
	public List<Vehicle> getVehicles() {
		return repository.findAll();
	}

	@Override
	public Vehicle getVehicle(int id) {
		return repository.findById(id).get();
	}
	@Override
	public boolean updateVehicle(Vehicle v) {
		return repository.save(v)!=null?true:false;
	}

	@Override
	public void archiveVehicle(int id) {
		 repository.deleteById(id);
		 
	}

	
}
