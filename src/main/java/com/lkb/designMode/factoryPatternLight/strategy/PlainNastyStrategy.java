package com.lkb.designMode.factoryPatternLight.strategy;


import com.lkb.designMode.factoryPatternLight.enumEntity.Light;
import com.lkb.designMode.factoryPatternLight.strategy.impl.LightUpStrategy;

public class PlainNastyStrategy implements LightUpStrategy {

    public String status(long time) {
        if (time > 3) {
            return Light.getLightValue("红灯");
        } else if (time >= 2) {
            return Light.getLightValue("黄灯");
        }else {
            return Light.getLightValue("绿灯");
        }
    }
}
