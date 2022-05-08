package com.lkb.designMode.factoryPatternLight;

import com.lkb.designMode.factoryPatternLight.enumEntity.UrgencyDegree;
import com.lkb.designMode.factoryPatternLight.strategy.context.LightStrategyContext;
import com.lkb.designMode.factoryPatternLight.strategy.impl.LightUpStrategy;

import java.util.*;

public class test  {
    private final static String GREEN = "1";// 亮灯规则：绿灯
    private final static String RED = "2";// 亮灯规则：红灯
    private final static String YELLOW = "3";// 亮灯规则：黄灯
    private final static String TJ = "1";// 特急
    public static void main(String[] args) {
        LightUpStrategy lightUpStrategy =
                Objects.requireNonNull(UrgencyDegree.getUrgencyDegree(TJ)).getLightUpStrategy();
        LightStrategyContext contextLight = new LightStrategyContext(lightUpStrategy);
        String result;

        long date=1;//一天
        result= contextLight.executeStrategy(date);
        System.out.println(result);

    }
}
