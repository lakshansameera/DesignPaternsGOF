package com.patterns.Builder;

public class Demo {

    public static void main (String []args){

        Carbuilder newCarBuilder = new Carbuilder();
        VehicleAssembler assembler = new VehicleAssembler(newCarBuilder);
        System.out.println("------------------car assesmbler----------------------");
        assembler.assemble();
        Vehicle cCar =  newCarBuilder.getVehicle();

        System.out.println("------------------bike assesmbler----------------------");

        BikeBuilder newBikeBuilder = new BikeBuilder();
        VehicleAssembler newBikeAssembler =  new VehicleAssembler(newBikeBuilder);
        newBikeAssembler.assemble();
        Vehicle eBike = newBikeBuilder.getVehicle();

        System.out.println(cCar);
        System.out.println(eBike);
    }
}
