package org.enom;

import java.util.Arrays;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';

    }
}

public class main {
    public static void main(String[] args) {
        List<Data> list = Arrays.asList(new Data("ammu"),new Data("nani"));
        list.forEach(temp ->{
            if(temp.getName().equals("ammu")){
                System.out.println("Founder StudyEasy:");
            }
            System.out.println(temp.getName());
        });
    }
}
