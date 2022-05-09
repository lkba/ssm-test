package com.lkb.designMode.decoratorPattern;

public class test {
    public static void main(String[] args){
        Component component = new ConcreteComponent ();
        Decorator decorator = new ConcreteDecorator(component);
        decorator .operation();
        System.out.println("----------------我是分割线-----------------");
        Decorator decoratorBand = new ConcreteDecorator(decorator);
        decoratorBand.operation();
    }

}
