package org.studyeasy;

public class SamsungPhone implements Phone, Android{

    @Override
    public String processor(){
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 512;
    }

    @Override
    public String whatsapp() {
        return "Send messages for free";
    }
}
