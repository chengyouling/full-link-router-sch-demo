package com.huaweicloud.servicestage.demo.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqProducer {
  @Autowired
  private InetUtils inetUtils;

  @Autowired
  private RabbitTemplate rabbitTemplate;

  private final static String QUEUE_NAME = "full.link.router";

  public void sendMessage() {
    String ip = inetUtils.findFirstNonLoopbackHostInfo().getIpAddress();
    rabbitTemplate.convertAndSend(QUEUE_NAME, ip + " produce message hello");
  }
}
