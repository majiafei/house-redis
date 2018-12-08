package com.huayue.house.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class HouseRedisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HouseRedisApplication.class, args);

        RedisTemplate redisTemplate = context.getBean(StringRedisTemplate.class);
        redisTemplate.opsForValue().set("name", "xiaoming");

        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);

        System.out.println("================");
        context.close();
    }
}
