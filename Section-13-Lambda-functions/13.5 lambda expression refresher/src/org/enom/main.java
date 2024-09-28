package org.enom;

interface Data{
    public float  demo();
}
public class main {
    public static void main(String[] args) {
        Data data = ()-> 10;
        System.out.println(data.demo());

    }
}
