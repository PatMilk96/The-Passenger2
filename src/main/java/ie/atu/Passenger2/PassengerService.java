package ie.atu.Passenger2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {
    private final PassengerRepo passengerRepo;
    public List<Passenger> getPassengers(){
        return passengerRepo.findAll();
    }


    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Patryk5", "123784456789", "0859485767", 25);
        return myPassenger;
    }
}
