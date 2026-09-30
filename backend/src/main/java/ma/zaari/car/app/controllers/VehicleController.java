package ma.zaari.car.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ma.zaari.car.app.models.Vehicle;
import ma.zaari.car.app.repositories.MockRepository;
import ma.zaari.car.app.repositories.VehicleRepository;
import ma.zaari.car.app.services.VehicleService;

@RestController
@RequestMapping("api/vehicles")
public class VehicleController {

	@Autowired
	MockRepository mockRepository;
	@Autowired 
	VehicleService service;
	
	@GetMapping("/vehicle/mock")
	public String getVehicleMock() {
		return """
				{category : "bike" , name: "mercedess benz", model: 2024}
				""";
	}
	@GetMapping("/mock")
	public List<Vehicle> getALlVehiclesMock(){
		return mockRepository.getVehicles();
	}
	@PostMapping("/mock")
	public void insertVehicleMock(Vehicle v) {
		mockRepository.addVehicle(v);
	}
	@GetMapping("/{id}/mock")
	public Vehicle selectByIDMock(@PathVariable int id) {
		return mockRepository.getByID(id);
	}
	

	 
	@GetMapping("/vehicle")
	public String getVehicle() {
		return """
				{category : "bike" , name: "mercedess benz", model: 2024}
				""";
	}
	@GetMapping()
	public List<Vehicle> getALlVehicles(){
		return service.getVehicles();
	}
	@PostMapping()
	public void insertVehicle(Vehicle v) {
		service.registerVehicle(v);
	}
	@GetMapping("/{id}")
	public Vehicle selectByID(@PathVariable int id) {
		return service.getVehicle(id);
	}
	
	
	
	
	
}
