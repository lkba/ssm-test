package com.lkb.designMode.factoryPatternLight.enumEntity;

public enum Light {
    YELLOW("黄灯","3" ),
    RED("红灯","2" ),
    GREEN("绿灯","1" ),;

    private String code;            //标识符id
    private String value;      // 描述

//    private final Logger logger = LoggerFactory.getLogger(UrgencyDegree.class);

    Light(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }
    public String getValue() {
        return value;
    }
//    public Light getLight() {
//        return Light;
//    }

    // 根据code获取对应的枚举类型
    public static String  getLightValue(String code) {
        for (Light light : Light.values()) {
            if (light.getCode().equals(code)) {
                return light.value;
            }
        }
//        logger.info("对应计算策略不存在,[type={\"+type+\"}]");
        System.out.println("对应亮灯值不存在,[type={\"+type+\"}]");
        return null;
    }
}
