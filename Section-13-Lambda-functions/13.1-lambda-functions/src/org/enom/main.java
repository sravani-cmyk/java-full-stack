package org.enom;

interface Lambda {
    public void demo();
}
public class main {
    public static void main(String[] args) {

//////////////////////////////////////////////////////
//        Lambda lambda = new Lambda() {
//            @Override
//            public void demo() {
//                System.out.println("statement 01");
//            }
//        };

////////////////////////////////////////////////////////
//        Lambda lambda = ()-> System.out.println("statement 01");
//        System.out.println("statement 02");

////////////////////////////////////////////////////////
        Lambda lambda = (()-> {
            System.out.println("statement 01");
            System.out.println("statement 02");
        });
        lambda.demo();
    }
}
