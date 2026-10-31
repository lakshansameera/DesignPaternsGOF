package com.patterns.Builder;

public class Vehicle {

    private String chassis;
    private String engine;
    private String tyres;
    private String outerFramework;

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public String getOuterFramework() {
        return outerFramework;
    }

    public void setOuterFramework(String outerFramework) {
        this.outerFramework = outerFramework;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "chassis='" + chassis + '\'' +
                ", engine='" + engine + '\'' +
                ", tyres='" + tyres + '\'' +
                ", outerFramework='" + outerFramework + '\'' +
                '}';
    }
}
