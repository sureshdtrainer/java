package com.siemens.patterns.builder;

public class Computer {

    //required parameter
    private String CPU;

    private String HDD;

    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }


    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled="
                + isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    
}
