package com.lkb.designMode.factoryPatternLight.strategy;


import com.lkb.designMode.factoryPatternLight.enumEntity.Light;
import com.lkb.designMode.factoryPatternLight.strategy.impl.LightUpStrategy;

public class ExtraUrgentStrategy implements LightUpStrategy {

    public String status( long time) {
        if (time > 1) {
            return Light.getLightValue("红灯");
        }else {
            return Light.getLightValue("黄灯");
        }
    }
}
