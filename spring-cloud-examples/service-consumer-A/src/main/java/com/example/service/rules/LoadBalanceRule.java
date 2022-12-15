package com.example.service.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalanceRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }


}
