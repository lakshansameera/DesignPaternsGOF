package com.patterns.Builder;

public class BikeBuilder implements VehicleBuilder{

    Vehicle vehicle = new Vehicle();

    @Override
    public void buildChassis() {
        System.out.println("Build Bike Chassis");
        vehicle.setChassis("BIKE24324sfwd");
    }

    @Override
    public void buildEngine() {
        System.out.println("Build Bike Engine");
        vehicle.setEngine("150CC");

    }

    @Override
    public void buildTyres() {
        vehicle.setTyres("Set 2 tyres");
        System.out.println("Build tyres");
    }

    @Override
    public void buildOuterFramework() {
        vehicle.setOuterFramework("Set outerframework");
        System.out.println("Build outer framework");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
