public class Main {
    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("Audi","R8","CF 87654",2,5));
        fleetOfCars.addCar(new GasolineCar("Lamborghini","Hurucán","GH 81726",2,11));
        fleetOfCars.addCar(new GasolineCar("BMW","M6","M TS 4256",2,23));


        fleetOfCars.addCar(new DieselCar("Volkswagen", "Multivan", "KY22 WXM",4,45,true));
        fleetOfCars.addCar(new DieselCar("Skoda", "Karoq 2.0", "KY22 VNC",4,15,true));
        fleetOfCars.addCar(new DieselCar("Range rover", "Sport D350", "KN72 NNO",4,9,true));

        fleetOfCars.addCar(new ElectricCar("Tesla", "Model 2", "TH 9454",4,100,400));
        fleetOfCars.addCar(new ElectricCar("Tesla", "Model 3", "BO 00085",4,180,720));
        fleetOfCars.addCar(new ElectricCar("Tesla", "Cybertruck", "LU 54555",2,60,200));

        System.out.println(fleetOfCars);
        System.out.println("Fulde registreringsafgift for flåden af biler er: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr. ");
    }
}
