public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        
        vehicle1.drive();
        vehicle2.drive();
    }
}
