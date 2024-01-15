package com.example.LR_2.jms;

import com.example.LR_2.models.Change;
import com.example.LR_2.repository.ChangeRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class ConsumerLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerLog.class);
    private final ChangeRepository logRepository;
    private String queueName;

    public ConsumerLog(@Value("${rabbitmq.queue.log}") String queueName, ChangeRepository logRepository) {
        this.queueName = queueName;
        this.logRepository = logRepository;
    }

    @RabbitListener(queues = "#{consumerLog.queueName}")
    public void consume(Change log) {
        LOGGER.info(String.format("Message received: %s", log.getChangeType()));
        logRepository.save(log);
    }
}