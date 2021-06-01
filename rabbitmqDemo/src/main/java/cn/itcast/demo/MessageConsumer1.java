package cn.itcast.demo;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 消息监听类
 */
public class MessageConsumer1 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("MessageConsumer1");
        System.out.println(new String(message.getBody()));
    }
}
