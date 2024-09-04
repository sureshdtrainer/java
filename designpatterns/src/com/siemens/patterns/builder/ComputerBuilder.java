package com.siemens.patterns.builder;

public class ComputerBuilder {

    // required parameter
    public String CPU;

    public String HDD;

    public String RAM;

    // optional parameters
    public boolean isGraphicsCardEnabled;
    public boolean isBluetoothEnabled;

    public ComputerBuilder(String CPU, String HDD, String RAM) {
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
        this.isGraphicsCardEnabled= isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }
}
