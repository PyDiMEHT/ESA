package com.example.LR_2.jms;

import com.example.LR_2.models.Change;
import com.example.LR_2.models.dto.ChangeType;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
    private final RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.exchange}")
    private String exchange;
    @Value("${rabbitmq.routing.key.log}")
    private String routingKeyLog;

    public void sendMessage(Object entity, ChangeType changeType, String description) {
        Change changeTable = createLog(entity, changeType, description);
        sendLog(changeTable);
        logMessageSent(changeTable.getChangeType());
    }

    private Change createLog(Object entity, ChangeType changeType, String description) {
        return Change.builder()
                .changeType(changeType)
                .tableName(entity.getClass().getSimpleName().toLowerCase())
                .description(description)
                .build();
    }

    private void sendLog(Change changeTable) {
        rabbitTemplate.convertAndSend(exchange, routingKeyLog, changeTable);
    }

    private void logMessageSent(ChangeType changeType) {
        LOGGER.info(String.format("Message sent: %s", changeType));
    }
}