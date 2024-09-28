package org.enom;

import java.io.Serializable;

public class vehicle implements Serializable {
    private String type;
    private int number;


    public void Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
            }

            @Override
            public String toString() {
                return "Vahicle{" +
                        "type='" + type + '\'' +
                        ", number=" + number +
                        '}';
            }

        }


