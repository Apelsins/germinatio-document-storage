//package vela.gliese1132b.germinatio.document.storage.domain.entity;
//
//import lombok.Data;
//import org.jetbrains.annotations.NotNull;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.redis.core.RedisHash;
//
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//@Data
//@RedisHash("Document")
//public class Document {
//    @NotNull
//    @Id
//    private String id;
//    @NotNull
//    private String description;
//    private LocalDateTime created;
//    private LocalDateTime modified;
//    private boolean completed;
//
//    public Document() {
//        LocalDateTime date = LocalDateTime.now();
//        this.id = UUID.randomUUID().toString();
//        this.created = date;
//        this.modified = date;
//    }
//
//    public Document(String description) {
//        this();
//        this.description = description;
//    }
//}