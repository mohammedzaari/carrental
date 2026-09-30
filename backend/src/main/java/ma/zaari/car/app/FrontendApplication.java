package ma.zaari.car.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;


import ma.zaari.car.app.repositories.ReservationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import ma.zaari.car.app.enumarations.VehicleStatus;
import ma.zaari.car.app.models.Reservation;
import ma.zaari.car.app.models.Vehicle;
import ma.zaari.car.app.repositories.VehicleRepository;
/*
 * @SpringBootApplication annotation can be used to enable those three features, that is:
 * 
 * @EnableAutoConfiguration :Enable auto-configuration of the Spring Application Context, attempting to
 *  guess and configure beans that you are likely to need. Auto-configuration classes are 
 *  usually applied based on your classpath and what beans you have defined. 
 * @ComponentScan : enable @Component scan on the package where the application is located
 * @SpringBootConfiguration: enable registration of extra beans in the context or the import 
 * 	of additional configuration classes. An alternative to Spring’s standard @Configuration 
 * 	that aids configuration detection in your integration tests.
 * */
@SpringBootApplication()
public class FrontendApplication {

	private final ReservationRepository reservationRepository;
	private VehicleRepository vehicleRepository;
	public FrontendApplication(VehicleRepository vehicleRepository, ReservationRepository reservationRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
		this.reservationRepository = reservationRepository;

	}


	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(FrontendApplication.class, args);
	
		VehicleRepository reppsitory = context.getBean(VehicleRepository.class);
		ReservationRepository reservationRepository = context.getBean(ReservationRepository.class);
		if(reppsitory.count()==0) {
			reppsitory.save(new Vehicle( 123456, "Toyota", "Corolla", 2020, "Blanc", "Essence",
			        "Automatique", 5, 45000, VehicleStatus.AVAILABLE, 35.50,
			        "Berline compacte, idéale pour la ville."));
	
			reppsitory.save(new Vehicle( 234567, "Renault", "Clio", 2019, "Rouge", "Diesel",
			        "Manuelle", 5, 62000, VehicleStatus.AVAILABLE, 28.00,
			        "Citadine économique, faible consommation."));
	
			reppsitory.save(new Vehicle( 345678, "BMW", "Serie 3", 2021, "Noir", "Essence",
			        "Automatique", 5, 28000, VehicleStatus.RENTED, 75.00,
			        "Berline premium, confort et performance."));
	
			reppsitory.save(new Vehicle( 456789, "Mercedes", "Classe A", 2022, "Gris", "Diesel",
			        "Automatique", 5, 15000, VehicleStatus.AVAILABLE, 68.90,
			        "Compacte premium, finitions haut de gamme."));
	
			reppsitory.save(new Vehicle( 567890, "Volkswagen", "Golf", 2018, "Bleu", "Essence",
			        "Manuelle", 5, 78000, VehicleStatus.MAINTENANCE, 32.00,
			        "Compacte polyvalente, bon rapport qualité-prix."));
	
			reppsitory.save(new Vehicle( 678901, "Audi", "A4", 2020, "Blanc", "Diesel",
			        "Automatique", 5, 41000, VehicleStatus.AVAILABLE, 62.50,
			        "Berline élégante, motorisation efficace."));
	
			reppsitory.save(new Vehicle( 789012, "Peugeot", "3008", 2021, "Gris", "Essence",
			        "Automatique", 5, 32000, VehicleStatus.RENTED, 55.00,
			        "SUV familial, spacieux et confortable."));
	
			reppsitory.save(new Vehicle( 890123, "Ford", "Focus", 2017, "Noir", "Essence",
			        "Manuelle", 5, 95000, VehicleStatus.AVAILABLE, 25.00,
			        "Compacte fiable, entretien économique."));
	
			reppsitory.save(new Vehicle( 901234, "Hyundai", "Tucson", 2022, "Blanc", "Hybride",
			        "Automatique", 5, 12000, VehicleStatus.AVAILABLE, 58.00,
			        "SUV hybride, faible consommation et confort."));
	
			reppsitory.save(new Vehicle( 112233, "Fiat", "500", 2019, "Jaune", "Essence",
			        "Manuelle", 4, 54000, VehicleStatus.AVAILABLE, 22.50,
			        "Petite citadine, idéale pour se garer facilement."));
		}
		if(reservationRepository.count()==0) {
			reservationRepository.save(new Reservation());
			reservationRepository.save(new Reservation());
			reservationRepository.save(new Reservation());
			reservationRepository.save(new Reservation());
			reservationRepository.save(new Reservation());
			reservationRepository.save(new Reservation());
		}
	}
}
