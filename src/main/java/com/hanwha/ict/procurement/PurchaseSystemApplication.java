package com.hanwha.ict.procurement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Objects;

@SpringBootApplication
@EnableCaching
public class PurchaseSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurchaseSystemApplication.class, args);
    }


    @Bean
    public CommandLineRunner testRedis(StringRedisTemplate redisTemplate) {
        return args -> {
            String pong = Objects.requireNonNull(redisTemplate.getConnectionFactory()).getConnection().ping();
            System.out.println("✅ Redis 연결 테스트 결과: " + pong);
        };
    }
}