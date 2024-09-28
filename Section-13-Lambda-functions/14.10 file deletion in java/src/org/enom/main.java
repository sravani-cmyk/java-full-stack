package org.enom;

import java.io.File;

public class main {
    public static void main(String[] args) {
        File file = new File("java//text.txt");
        if(file.delete()){
            System.out.println("File Deleted");
        }else{
            System.out.println("File deleted has some error");
        }
    }
}
