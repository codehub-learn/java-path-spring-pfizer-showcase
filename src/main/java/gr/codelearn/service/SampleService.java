package gr.codelearn.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    @RabbitListener(queues = "queue.custom")
    public void receiveMessage(Object message){
        System.out.println("Received (q1): " + message);
    }

    @RabbitListener(queues = "queue.custom2")
    public void receiveMessage2(Object message){
        System.out.println("Received (q2): " + message);
    }
}
