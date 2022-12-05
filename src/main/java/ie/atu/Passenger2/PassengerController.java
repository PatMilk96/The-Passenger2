package ie.atu.Passenger2;

public class PassengerController {
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/passenger")
public class PassengerController {

    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PassengerController.class, args);
    }

    @GetMapping
    public List<Passenger> getPassenger(){
        return myService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID){
        return myService.getPassenger(passengerID);
    }
}
