package com.shrayansh;

import com.shrayansh.product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    private List<Vehicle> vehicleList;

    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }

    public Vehicle getVehicle(int vehicleId){
        return vehicleList.stream()
                .filter(vehicle -> vehicle.getVehicleId() == vehicleId)
                .findFirst()
                .orElse(null);
    }

    public List<Vehicle> getVehicleList() {
        // we can fetch vehicle list based on some filter here as well.
        return vehicleList;
    }


    //crud operation to add vehicles into list.
}
