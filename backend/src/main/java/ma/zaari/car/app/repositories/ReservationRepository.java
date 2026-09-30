package ma.zaari.car.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.zaari.car.app.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
}
