package gr.codelearn.amqp;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleExchanges {

    @Bean
    FanoutExchange fanoutExchange() {
        // "Broadcasting" exchange mechanism
        return new FanoutExchange("fanout.exchange.custom", false, true);
    }
}
