package com.lkb.designMode.factoryPatternLight.enumEntity;


import com.lkb.designMode.factoryPatternLight.strategy.ExtraUrgentStrategy;
import com.lkb.designMode.factoryPatternLight.strategy.OrdinaryStrategy;
import com.lkb.designMode.factoryPatternLight.strategy.PlainNastyStrategy;
import com.lkb.designMode.factoryPatternLight.strategy.impl.LightUpStrategy;

public enum UrgencyDegree {

    EXTRA_URGENT("1","特急",new ExtraUrgentStrategy()),
    PLAIN_NASTY("2","急件",new PlainNastyStrategy()),
    ORDINARY("3","平件",new OrdinaryStrategy()),;

    private String code;            //标识符id
    private String description;      // 描述
    private LightUpStrategy lightUpStrategy; // 计算策略接口的对象

//    private final Logger logger = LoggerFactory.getLogger(UrgencyDegree.class);

    UrgencyDegree(String code, String description, LightUpStrategy lightUpStrategy) {
        this.code = code;
        this.description = description;
        this.lightUpStrategy = lightUpStrategy;
    }

    public String getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public LightUpStrategy getLightUpStrategy() {
        return lightUpStrategy;
    }

    // 根据code获取对应的枚举类型
    public static UrgencyDegree getUrgencyDegree(String code) {
        for (UrgencyDegree urgencyDegree : UrgencyDegree.values()) {
            if (urgencyDegree.getCode().equals(code)) {
                return urgencyDegree;
            }
        }
//        logger.info("对应计算策略不存在,[type={\"+type+\"}]");
        System.out.println("对应计算策略不存在,[type={\"+type+\"}]");
        return null;
    }
}
