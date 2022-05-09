package com.lkb.designMode.decoratorPattern;
/**
 * 具体装饰器类
 **/
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component){
        super(component);
    }
    private void operationFirst(){
        System.out.println("hello, my name is operationFirst");
    }
    private void operationLast(){
        System.out.println("hello, my name is operationLast");
    }
    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
        anotherOperation();
    }
    //新功能
    public void anotherOperation() {
        System.out.println("hello, my name is  anotherOperation");
    }
}
