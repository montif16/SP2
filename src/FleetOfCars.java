import java.util.ArrayList;
public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

     void addCar(Car car) {
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for(Car car : fleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        StringBuilder carText = new StringBuilder();
        for(Car car: fleet) {
            carText.append(car.toString()).append(" \n");
        }
        return carText.toString();
    }
}
