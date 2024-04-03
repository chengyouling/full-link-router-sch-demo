package com.huaweicloud.servicestage.demo.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {
  private final static String QUEUE_NAME = "full.link.router";

  @RabbitListener(queues = QUEUE_NAME)
  public void listenSimpleQueueMessage(String message) throws InterruptedException{
    System.out.println("消费到 " + QUEUE_NAME + " 队列消息：" + message);
  }
}
