package org.enom;

import java.util.*;

class  Data{
    String name;
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
        List<Data> list = new ArrayList<>();
        list.add(new Data("ammu"));
        list.add(new Data("nani"));
        list.add(new Data("sai"));
        list.add(new Data("reddy"));
        list.add(new Data("bharu"));

//        Collections.sort(list, new Comparator<Data>() {
//            @Override
//            public int compare(Data o1, Data o2) {
//                return 0;
//            }
//        });
        Collections.sort(list,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        for (Data temp: list){
            System.out.println(temp);
        }


    }
}
