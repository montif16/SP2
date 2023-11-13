abstract class AFuelCar extends ACar {
    AFuelCar(String make, String model, String registrationNumber, int numberOfDoors,int kmPrLitre) {
        super(make,model,registrationNumber,numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();
    int kmPrLitre;
    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "km/l: " + kmPrLitre + ", fueltype: " + getFuelType();
    }
}