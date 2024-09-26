package thirdAssignment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");
        Manufacture ford = new Manufacture("Ford", "USA");

        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

        ICEV iceVehicle = new ICEV(toyota, combustionEngine);
        BEV bevVehicle = new BEV(tesla, electricEngine);
        HybridV hybridVehicle = new HybridV(ford, hybridEngine);

        // Array of Vehicle
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(iceVehicle);
        vehicles.add(bevVehicle);
        vehicles.add(hybridVehicle);

        // Show characteristics of all vehicles
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}
