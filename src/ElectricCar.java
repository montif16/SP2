public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String make, String model, String registrationNumber, int numberOfDoors,int batteryCapacity, int maxRange) {
        super(make, model, registrationNumber, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getRegistrationFee() {
        int kmPrLitre = (int) (100 / (getWhPrKm() / 91.25));
        int registrationFee = 0;
        if (kmPrLitre >= 20) {
            registrationFee += 330;
        } else if (kmPrLitre >= 15) {
            registrationFee += 1050;
        } else if (kmPrLitre >= 10) {
            registrationFee += 2340;
        } else if (kmPrLitre >= 5) {
            registrationFee += 5500;
        } else {
            registrationFee += 10470;
        }
        return registrationFee;
    }

    int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    float getWhPrKm() {
        return ((float) getBatteryCapacityKWh() / getMaxRangeKm() * 1000);
    }

    public String toString() {
        return super.toString() + "battery: " + getBatteryCapacityKWh() + ", range: " + getMaxRangeKm() + ", Electric";
    }
}