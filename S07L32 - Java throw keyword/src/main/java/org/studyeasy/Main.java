package org.studyeasy;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.doSomething();
        }finally {
            System.out.println("This demo is useless");
        }


    }
    public void doSomething() throws RuntimeException {
        String x = "one";
        if (x.equals("zero")){
            throw new RuntimeException();
        }
        System.out.println("Do something!");
    }
}
