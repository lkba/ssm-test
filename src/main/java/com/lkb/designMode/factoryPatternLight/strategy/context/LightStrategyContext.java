package com.lkb.designMode.factoryPatternLight.strategy.context;


import com.lkb.designMode.factoryPatternLight.strategy.impl.LightUpStrategy;

public class LightStrategyContext {
    // 运算接口
    private LightUpStrategy strategy;
    // 通过构造函数或者set方法赋值
    public LightStrategyContext(LightUpStrategy strategy) {
        this.strategy = strategy;
    }
    // 简单调用具体实现对应的方法
    public String executeStrategy(long time) {
        return strategy.status(time);
    }

    public LightUpStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(LightUpStrategy strategy) {
        this.strategy = strategy;
    }
}
