package ie.atu.Passenger2;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

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
    public List<Passenger> getPassenger() {
        return myService.getPassengers();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID) {
        return myService.getPassenger(passengerID);
    }
}
