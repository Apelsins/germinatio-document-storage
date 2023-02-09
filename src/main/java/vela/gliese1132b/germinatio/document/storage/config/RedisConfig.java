//package vela.gliese1132b.germinatio.document.storage.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
//import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//@EnableRedisRepositories
//@Configuration
//public class RedisConfig {
//
//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory() {
//        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
//        redisConfig.setHostName("localhost");
//        redisConfig.setPort(6379);
//        return new JedisConnectionFactory(redisConfig);
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new JdkSerializationRedisSerializer());
//        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        redisTemplate.setEnableTransactionSupport(true);
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//}
