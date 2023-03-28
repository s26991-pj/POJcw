public class Main {
    public static void main(String[] args) {
        VehicleProg vehicleProg = new VehicleProg();
        vehicleProg.Vehicleprog(args);
    }
}
    class VehicleProg{
        public void  Vehicleprog(String[] args) {
            Vehicle Minivan = new Vehicle("Minivan", 8, 60, 20);
            Vehicle Sportscar = new Vehicle("Sportscar", 2, 30, 15);
            System.out.println("Minivan ma maksymalny zasięg: " + Minivan.fuelcap / Minivan.lkm *100 + " km");
            System.out.println("Sportscar ma maksymalny zasięg: " + Sportscar.fuelcap / Sportscar.lkm *100 + " km");
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



    }


    }
