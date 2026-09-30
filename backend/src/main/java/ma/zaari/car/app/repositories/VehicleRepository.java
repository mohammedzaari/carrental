package ma.zaari.car.app.repositories;

import java.util.Optional;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.zaari.car.app.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
		//Attention :  @Query of jpgl doesn't support the INSERT query such as sql, just SELECT,Update,delete
	
}
