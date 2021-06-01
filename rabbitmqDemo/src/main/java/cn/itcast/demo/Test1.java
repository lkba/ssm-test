package cn.itcast.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-rabbitmq-producer.xml");
        RabbitTemplate rabbitTemplate=(RabbitTemplate) context.getBean("rabbitTemplate");

        rabbitTemplate.convertAndSend("","queue.test","直接连接模式");
        ((ClassPathXmlApplicationContext)context).close();
    }
}
