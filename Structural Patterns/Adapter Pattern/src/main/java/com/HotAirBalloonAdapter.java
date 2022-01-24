package com;


import com.baloon.HotAirBalloon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HotAirBalloonAdapter implements IAircraft {

    private final HotAirBalloon hotAirBalloon;

    @Override
    public void fly() {
        String gasUsed = hotAirBalloon.getGasUsed();
        hotAirBalloon.fly(gasUsed);
    }
}
