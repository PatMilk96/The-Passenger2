package ie.atu.Passenger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
}
