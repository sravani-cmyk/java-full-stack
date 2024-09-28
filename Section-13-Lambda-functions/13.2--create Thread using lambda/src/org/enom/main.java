package org.enom;

public class main {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            System.out.println("stmt 01");
            System.out.println("stmt 02");
        });
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Statement ");
//            }
//        });
        thread.start();
    }
}
