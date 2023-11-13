public class DieselCar extends AFuelCar{
    boolean particleFilter;

    public DieselCar(String make, String model, String registrationNumber, int numberOfDoors,int kmPrLitre,boolean particleFilter) {
        super(make, model, registrationNumber, numberOfDoors,kmPrLitre);
        this.particleFilter = particleFilter;
    }
    private boolean hasParticleFilter() {
        return particleFilter;
    }

    String getFuelType() {
        return "Diesel";
    }

    public int getRegistrationFee() {
        int registrationFee = 0;
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            registrationFee += 330+130;
        }
        else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            registrationFee += 1050+1390;
        }
        else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            registrationFee += 2340+1850;
        }
        else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            registrationFee += 5500+2770;
        }
        else {
            registrationFee += 10470+15260;
        }
        if(!hasParticleFilter()) {
            registrationFee += 1000;
        }
        return registrationFee;
    }
}
