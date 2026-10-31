package com.patterns.Builder;

public interface VehicleBuilder {
    void buildChassis();
    void buildEngine();
    void buildTyres();
    void buildOuterFramework();
    Vehicle getVehicle();

}
