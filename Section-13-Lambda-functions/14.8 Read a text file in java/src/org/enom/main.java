package org.enom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("org.enom//ext.txt"));
            String line;
            while (sc.hasNext()){
                line= sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
