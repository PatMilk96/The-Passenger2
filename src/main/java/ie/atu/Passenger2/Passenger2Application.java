package ie.atu.Passenger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class Passenger2Application {

	public static void main(String[] args) {
		SpringApplication.run(Passenger2Application.class, args);
	}


	@GetMapping
	public List<Passenger> getPassenger(){
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Patryk", "123456789", "0859485767", 25),
				new Passenger("Mr", "Patryk2", "987654321", "0859475763", 34),
				new Passenger("Mr", "Patryk3", "548735647", "0859482163", 50),
				new Passenger("Mr", "Patryk4", "534897328", "0858685763", 19));
				return myPassengers;
	}
}
