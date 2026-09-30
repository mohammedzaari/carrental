package ma.zaari.car.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.zaari.car.app.models.Reservation;
import ma.zaari.car.app.services.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
	@Autowired
	ReservationService service;
	
	@GetMapping
	public List<Reservation> getReservations(){
		return service.getReservations();
	}
}
