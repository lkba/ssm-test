package cn.itcast.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1_2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-rabbitmq-producer.xml");
        RabbitTemplate rabbitTemplate=(RabbitTemplate) context.getBean("rabbitTemplate");

        rabbitTemplate.convertAndSend("exchange.fanout_test","","分列连接模式");
        ((ClassPathXmlApplicationContext)context).close();
    }
}
