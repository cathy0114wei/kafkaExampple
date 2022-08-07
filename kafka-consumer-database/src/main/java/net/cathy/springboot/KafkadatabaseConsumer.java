package net.cathy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkadatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkadatabaseConsumer.class);

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "group5")
    public void consume(String eventMessage){
        LOGGER.info(String.format("Message received -> %s", eventMessage));
    }
}
