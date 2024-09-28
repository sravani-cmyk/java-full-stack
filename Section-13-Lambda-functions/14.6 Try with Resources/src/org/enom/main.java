package org.enom;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
           BufferedWriter bw = new BufferedWriter(new FileWriter("enom\\enom.txt",true));
            bw.newLine();
            bw.write("Author");
            bw.write("Ammu");
            System.out.println("File created successfully");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }finally {
            try {;
                bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
