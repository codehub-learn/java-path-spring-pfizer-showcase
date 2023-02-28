package gr.codelearn.programmatic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderRunner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate; // responsible for sending/receiving messages

    public MessageSenderRunner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) {
        rabbitTemplate.convertAndSend("testing.queue", "Hello. Application initialized.");
    }
}
