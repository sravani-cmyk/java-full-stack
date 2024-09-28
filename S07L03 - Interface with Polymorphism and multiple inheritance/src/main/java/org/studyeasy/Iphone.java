package org.studyeasy;

public class Iphone implements Phone, IOS, Android{

    @Override
    public String processor(){
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String airdrop() {
        return "copy and paste anywhere";
    }

    @Override
    public String whatsapp() {
        return "hello";
    }
}
