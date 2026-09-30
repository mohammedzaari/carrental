package ma.zaari.car.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.zaari.car.app.models.Reservation;
import ma.zaari.car.app.repositories.ReservationRepository;

@Service
public class DefaultReservationService implements ReservationService{
	ReservationRepository reservationRepository;

	public DefaultReservationService(ReservationRepository reservationRepository) {
		super();
		this.reservationRepository = reservationRepository;
	}
	
	public List<Reservation> getReservations(){
		return reservationRepository.findAll();
	}
	
	
}
