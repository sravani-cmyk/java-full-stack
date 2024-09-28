package org.enom;

import java.io.*;

public class main {
    public static void main(String[] args) {
        File file = new File("enom\\enom.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("File operation was successfull ");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
