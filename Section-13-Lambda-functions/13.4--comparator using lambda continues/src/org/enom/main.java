package org.enom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

//        Collections.sort(list,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(list, ((o1, o2) -> {
            if (o1.getName().length() < o2.getName().length()) {
                return -1;
            } else if (o1.getName().length() > o2.getName().length()) {
                return 1;
            }else {
                return 0;
            }
        }));

        for (Data temp : list){
            System.out.println(temp);
        }

    }

    }

