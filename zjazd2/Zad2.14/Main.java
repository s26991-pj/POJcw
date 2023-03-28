public class Main {
    public static void main(String[] args) {
        VehicleProg vehicleProg = new VehicleProg();
        vehicleProg.vehicleprog(args);
    }
}

class VehicleProg {
    public void vehicleprog(String[] args) {
        Vehicle minivan = new Vehicle("Minivan", 8, 60, 20);
        Vehicle sportscar = new Vehicle("Sportscar", 2, 30, 15);
        System.out.println("Minivan przewozi " + minivan.getPassengers() + " osób "+"na odległość do "
                + minivan.range() + " kilometrów");
        System.out.println("Sportscar przewozi " + sportscar.getPassengers() + " osób " + "na odległość do "
                + sportscar.range() + " kilometrów");

    }
}

class Vehicle {
    private String nazwa;
    private int passengers;
    private int fuelcap;
    private double lkm;

    public Vehicle(String nazwa, int passengers, int fuelcap, double lkm) {
        this.nazwa = nazwa;
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public double range() {
        return fuelcap / lkm * 100;
    }
}
