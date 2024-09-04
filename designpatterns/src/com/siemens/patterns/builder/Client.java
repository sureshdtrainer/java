package com.siemens.patterns.builder;

public class Client {

    public static void main(String[] args) {
        
        Computer computer1 = new ComputerBuilder("i3","1TB","16GB")
                            .build();

        
    }

}
