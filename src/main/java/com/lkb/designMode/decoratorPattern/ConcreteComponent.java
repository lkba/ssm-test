package com.lkb.designMode.decoratorPattern;


/**
 * 具体组件类
 **/
class ConcreteComponent extends Component {
    @Override
    public void operation(){
        System.out.println("hello, my name is ConcreteComponent");
    }
}