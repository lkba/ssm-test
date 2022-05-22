package com.lkb.designMode.mixedUse.T1.handler;



import java.util.Arrays;


public enum OpenAcctMethodEnum {

    COMPLETE("complete", "完整开户模式，需要执行所有流程"),
    PARTLY("partly", "部分开户模式，用款申请时补充其他流程");

    private String type;
    private String desc;

    OpenAcctMethodEnum(String type, String desc){
        this.type = type;
        this.desc = desc;
    }

    /**
     *
     * @param type
     * @return
     */
    public static OpenAcctMethodEnum getEnumByType(String type){
        return Arrays.stream(OpenAcctMethodEnum.values())
                .filter(eachEnum -> eachEnum.getType().equals(type))
                .findFirst().get();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
