package org.studyeasy;

public class SamsungPhone implements Phone{
    public String processor(){
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String storage(){
        return "280";
    }

    @Override
    public String ringtone(){
        return "Talk Talk Talk";
    }
}
