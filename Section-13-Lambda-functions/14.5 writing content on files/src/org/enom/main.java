package org.enom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("enom//enom.txt"))){
            bw.write("Author");
            bw.write("Ammu");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("something wrong");
        }
    }
}
