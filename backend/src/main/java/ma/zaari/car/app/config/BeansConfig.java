package ma.zaari.car.app.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.zaari.car.app.enumarations.VehicleStatus;
import ma.zaari.car.app.models.Vehicle;
import ma.zaari.car.app.repositories.MockRepository;

@Configuration
public class BeansConfig {
	
	@Bean 
	public Vehicle v1() {
		return new Vehicle( 789012, "Peugeot", "3008", 2021, "Gris", "Essence",
		        "Automatique", 5, 32000, VehicleStatus.RENTED, 55.00,
		        "SUV familial, spacieux et confortable.");
	}	
	@Bean
	public MockRepository mockRepoository() {
		return new MockRepository();
	}
}
