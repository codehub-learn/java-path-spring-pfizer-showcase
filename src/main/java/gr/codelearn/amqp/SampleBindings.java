package gr.codelearn.amqp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleBindings {

    @Bean
    Binding fanoutBinding1(FanoutExchange exchange, @Qualifier("cq1") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    Binding fanoutBinding2(FanoutExchange exchange, @Qualifier("cq2") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    Binding fanoutBinding3(FanoutExchange exchange, @Qualifier("cq3") Queue queue) {
        return BindingBuilder.bind(queue).to(exchange);
    }
}
