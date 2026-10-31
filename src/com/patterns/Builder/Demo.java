package com.patterns.Builder;

public class Demo {

    public static void main (String []args){
        Carbuilder builder = new Carbuilder();
        builder.buildChassis();
        builder.buildEngine();
        builder.buildTyres();
        builder.buildOuterFramework();

        Vehicle firstCar = builder.getVehicle();
        System.out.println(firstCar.toString());

        builder.buildTyres();
        builder.buildEngine();
        Vehicle secondCar = builder.getVehicle();
        System.out.println(secondCar.toString());

        System.out.println("----------------------------------------");
        BikeBuilder bikeBuilder = new BikeBuilder();
        bikeBuilder.buildChassis();
        bikeBuilder.buildEngine();
        bikeBuilder.buildTyres();
        Vehicle firstBike = bikeBuilder.getVehicle();
        //System.out.println(firstBike.toString());

        Carbuilder newCarBuilder = new Carbuilder();
        VehicleAssembler assembler = new VehicleAssembler(newCarBuilder);
        System.out.println("------------------car assesmbler----------------------");
        assembler.assemble();
        Vehicle cCar =  builder.getVehicle();

        System.out.println("------------------bike assesmbler----------------------");

        BikeBuilder newBikeBuilder = new BikeBuilder();
        VehicleAssembler newBikeAssembler =  new VehicleAssembler(newBikeBuilder);
        newBikeAssembler.assemble();
        Vehicle eBike = newBikeBuilder.getVehicle();


    }
}
