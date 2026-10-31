package com.patterns.Builder;

public class BikeBuilder implements VehicleBuilder{

    Vehicle vehicle = new Vehicle();

    @Override
    public void buildChassis() {
        System.out.println("Build Bike Chassis");
    }

    @Override
    public void buildEngine() {
        System.out.println("Build Bike Engine");
    }

    @Override
    public void buildTyres() {
        System.out.println("Build tyres");
    }

    @Override
    public void buildOuterFramework() {
        System.out.println("Build outer framework");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
