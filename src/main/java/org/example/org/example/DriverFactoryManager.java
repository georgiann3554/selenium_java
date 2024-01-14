package org.example;




public class DriverFactoryManager {

    public static DriverManager getDriverManager(DriverType type){
     
        DriverManager driverManager;

        switch(type){

            case CHROME:
              driverManager = new ChromeDriverManager();
              break;
             

        
            default:
              driverManager = new ChromeDriverManager();
              break;

            }

     return  driverManager;      

    }
}
