abstract class ACar implements Car {
    String registrationNumber;
    String make ;
    String model;
    int numberOfDoors;
    public ACar(String make, String model, String registrationNumber, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return make + " " + model + "; " + registrationNumber + ", " + numberOfDoors + " doors, ";
    }
}

