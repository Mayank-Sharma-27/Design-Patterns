package com.baloon;

import org.springframework.stereotype.Service;

@Service
public class HotAirBalloon {

    private String gasUsed = "Helium";

    public String getGasUsed() {
        return this.gasUsed;
    }

    public void fly(String gasUsed) {
        System.out.println("Gas used is : {}" + gasUsed);
    }

}
