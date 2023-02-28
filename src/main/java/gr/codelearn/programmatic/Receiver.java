package gr.codelearn.programmatic;

import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Used with the RabbitMQContainerConfiguration class
 */
@Component
public class Receiver {
    /* Required by Spring */
    public void receiveMessage(Object message) {
        System.out.println("Received: " + message);
    }
}
