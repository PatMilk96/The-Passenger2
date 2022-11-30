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

    public List<Passenger> getPassenger(){
        return passengerRepo.findAll();
    }

    public List<Passenger> getPassengers(){
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Patryk1", "1234567821", "0859485767", 25),
                new Passenger("Mr", "Patryk2", "9876543211", "0859475763", 34),
                new Passenger("Mr", "Patryk3", "5487356471", "0859482163", 50),
                new Passenger("Mr", "Patryk4", "5348973281", "0858685763", 19));
        return myPassengers;
    }


    public Passenger getPassenger(String passengerID){
        Passenger myPassenger = new Passenger("Mr", "Patryk5", "123784456789", "0859485767", 25);
        return myPassenger;
    }
}
