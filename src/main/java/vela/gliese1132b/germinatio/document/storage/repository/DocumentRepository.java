//package vela.gliese1132b.germinatio.document.storage.repository;
//
//import lombok.AllArgsConstructor;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//import vela.gliese1132b.germinatio.document.storage.domain.entity.Document;
//
//import java.util.List;
//
//@AllArgsConstructor
//@Repository
//public class DocumentRepository {
//    public static final String HASH_KEY_NAME = "MENU-ITEM";
//
//    private final RedisTemplate redisTemplate;
//
//
//    public Document save(Document menu){
//        // SETS menu object in MENU-ITEM hashmap at menuId key
//        redisTemplate.opsForHash().put(HASH_KEY_NAME,menu.getId(),menu);
//        return menu;
//    }
//
//    public List<Document> findAll(){
//        // GET all Menu values
//        return redisTemplate.opsForHash().values(HASH_KEY_NAME);
//    }
//
//    public Document findItemById(int id){
//        // GET menu object from MENU-ITEM hashmap by menuId key
//        return (Document) redisTemplate.opsForHash().get(HASH_KEY_NAME,id);
//    }
//
//
//    public String deleteMenu(int id){
//        // DELETE the hashkey by menuId from MENU-ITEM hashmap
//        redisTemplate.opsForHash().delete(HASH_KEY_NAME,id);
//        return "Menu deleted successfully !!";
//    }
//}