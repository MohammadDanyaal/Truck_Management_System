package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {

        TruckService truckService = new TruckService();

        Truck tata = new Truck("TATA","2019",1000,"Rajesh");
        Truck volvo = new Truck("VOLVO","2023",1000,"Akash");
        Truck eicher = new Truck("EICHER","2022",1000,"Harshit");

        //Adding data into database
        System.out.println("Adding data.....");
        truckService.addTruck(tata);
        truckService.addTruck(volvo);
        truckService.addTruck(eicher);

        //fetch
        System.out.println("Fetching data by id ........"+1);
        Truck truck = truckService.getTruckById(1);
        System.out.println("Truck data : "+truck);

        //Updating truck data
        System.out.println("updating data..........");
        truck.setDriverName("Ramesh");
        truckService.updateTruck(truck);
        System.out.println("Updated Truck data : "+truckService.getTruckById(1));


        //get all truck data
        System.out.println("Fetching all data............");
        List<Truck> allTrucks = truckService.getAllTrucks();
        System.out.println("All trucks in DB : ");
        for (Truck truck1 : allTrucks)
        {
            System.out.println(truck1);
        }

        //Delete truck data
        System.out.println("Deleteing data by id....." +2);
        truckService.deleteTruck(2);
        System.out.println("Data deleted by id : "+2);

        System.out.println("Get all data...........");
        allTrucks=truckService.getAllTrucks();
        System.out.println("All trucks after all operations :");
        System.out.println(allTrucks);

    }
}
