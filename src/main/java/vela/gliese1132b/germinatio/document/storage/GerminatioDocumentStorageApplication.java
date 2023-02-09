package vela.gliese1132b.germinatio.document.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableMongoRepositories
//@EnableRedisRepositories
@SpringBootApplication
public class GerminatioDocumentStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerminatioDocumentStorageApplication.class, args);
    }

}
