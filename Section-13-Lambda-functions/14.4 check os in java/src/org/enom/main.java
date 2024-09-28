package org.enom;

public class main {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);

        if (os.indexOf("win")>=0){
            System.out.println("windows");
        }else if(os.indexOf("mac")>=0){
            System.out.println("mac");
        } else if (os.indexOf("nix")>=0 || os.indexOf("nux")>=0 || os.indexOf("nlx")>=0) {
            System.out.println("Apple sys");
        }else {
            System.out.println("unknown");
        }
    }
}
