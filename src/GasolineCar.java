public class GasolineCar extends AFuelCar {


    public GasolineCar(String make, String model, String registrationNumber, int numberOfDoors, int kmPrLitre) {
        super(make, model, registrationNumber, numberOfDoors,kmPrLitre);
    }

    String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {
        int registrationFee = 0;
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            registrationFee += 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            registrationFee += 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            registrationFee += 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            registrationFee += 5500;
        } else {
            registrationFee += 10470;
        }
        return registrationFee;
    }

    public String toString() {
        return super.toString();
    }
}
