package vela.gliese1132b.germinatio.document.storage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import vela.gliese1132b.germinatio.document.storage.domain.entity.GroceryItem;

import java.util.List;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    @Query("{name:'?0'}")
    GroceryItem findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);

    @Override
    public long count();

}