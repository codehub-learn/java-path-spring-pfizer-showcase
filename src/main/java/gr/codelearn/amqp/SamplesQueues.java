package gr.codelearn.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SamplesQueues {

    @Bean("cq1")
    protected Queue customQueue() {
        // Non-durable means that the queue and any messages on it will be removed when RabbitMQ is stopped.
        return new Queue("queue.custom", false);
    }

    @Bean("cq2")
    protected Queue customQueue2() {
        // Non-durable means that the queue and any messages on it will be removed when RabbitMQ is stopped.
        return new Queue("queue.custom2", false);
    }

    @Bean("cq3")
    protected Queue customQueue3() {
        // Non-durable means that the queue and any messages on it will be removed when RabbitMQ is stopped.
        return new Queue("queue.custom3", false);
    }
}
