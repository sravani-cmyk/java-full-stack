package org.studyeasy;

public class Iphone implements Phone{

    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String storage() {
        return "280";
    }

    @Override
    public String ringtone(){
        return "Tak Tak Tak ";
    }
}
