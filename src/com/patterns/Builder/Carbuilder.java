package com.patterns.Builder;

public class Carbuilder implements VehicleBuilder{

    private Vehicle vehicle = new Vehicle();

    @Override
    public void buildChassis() {
        System.out.println("Assembling Chassis of the vehicle");
        vehicle.setChassis("KSJKLJLSD234252");
    }

    @Override
    public void buildEngine() {
        System.out.println("Assembling Engine");
        vehicle.setEngine("1500CC");
    }

    @Override
    public void buildTyres() {
        System.out.println("Assembling tyres");
        vehicle.setTyres("4 tyres added");
    }

    @Override
    public void buildOuterFramework() {
        System.out.println("Assembling outer frame work");
        vehicle.setOuterFramework("Outer frame work assembled");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
