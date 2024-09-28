package org.enom;


import java.util.function.IntPredicate;

public class main {
    public static void main(String[] args) {
//        IntPredicate lessThan18 = new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                if (value < 18){
//                    return true;
//                }else {
//                    return false;
//                }
//            }
//        };
//        System.out.println(lessThan18.test(20));


        IntPredicate lessThan18 = value -> value <10;
        IntPredicate moreThan18 = value -> value >18;
        System.out.println(lessThan18.and(moreThan18).test(10));
    }
}
