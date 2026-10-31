package com.patterns.Builder;

public class VehicleAssembler {

    private VehicleBuilder builder;

    public VehicleAssembler(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assemble(){
        builder.buildChassis();
        builder.buildEngine();
        builder.buildTyres();
        builder.buildOuterFramework();
    }

}
