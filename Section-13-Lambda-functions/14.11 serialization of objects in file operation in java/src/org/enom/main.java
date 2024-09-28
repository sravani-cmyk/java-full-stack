package org.enom;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main{
    public static void main(String[] args) {
        bike = new vehicle("Bike",52141);
        vehicle car= new vehicle("Car",95824);

        try (FileOutputStream fos = new FileOutputStream("enom//vehicle.dat")){
            try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
                obj.writeObject(bike);
                obj.writeObject(car);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }




        }


    }
}










