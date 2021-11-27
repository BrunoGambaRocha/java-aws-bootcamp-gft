package br.com.brunoti.microservicesjava.shoppingcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfig {

    @Bean
    public RedisConnectionFactory connectionFactory() {
      RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("192.168.99.100", 6379);
      return new JedisConnectionFactory(config);
    }

    @Bean
    public RedisTemplate<?, ?> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
  
      RedisTemplate<byte[], byte[]> template = new RedisTemplate<byte[], byte[]>();
      template.setEnableTransactionSupport(true);
      template.setConnectionFactory(redisConnectionFactory);
      return template;
    }

}