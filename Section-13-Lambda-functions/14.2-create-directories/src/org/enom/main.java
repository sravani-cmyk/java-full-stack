package org.enom;

import java.io.File;

public class main {
    public static void main(String[] args) {
        File file = new File("folder\\subfolder\\yetanotherfolder");
        if (file.mkdirs()) {
            System.out.println("Folder created");
        }else {
            System.out.println("folder exists");
        }
    }
}
