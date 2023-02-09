package vela.gliese1132b.germinatio.document.storage.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vela.gliese1132b.germinatio.document.storage.domain.entity.GroceryItem;
import vela.gliese1132b.germinatio.document.storage.repository.ItemRepository;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/mongo")
public class MangoController {
    private final ItemRepository itemRepository;

    @GetMapping
    public List<GroceryItem> list() {
        List<GroceryItem> all = itemRepository.findAll();
        return all;
    }

    @PostMapping
    public void create() {
        System.out.println("Data creation started...");
        itemRepository.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        itemRepository.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        itemRepository.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
        itemRepository.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        itemRepository.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
        System.out.println("Data creation complete...");
    }
}