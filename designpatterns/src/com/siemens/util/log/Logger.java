package com.siemens.util.log;

public class Logger {

    private static Logger logger;

    private Logger(){

    }

    public void log(String message){

        System.out.println("Log : " +message);
    }

    public  static Logger getInstance(){

        if(logger==null){
            logger = new Logger();
        }
        return logger;
    }

}
