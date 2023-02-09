//package vela.gliese1132b.germinatio.document.storage.controller;
//
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import vela.gliese1132b.germinatio.document.storage.domain.entity.Document;
//import vela.gliese1132b.germinatio.document.storage.repository.DocumentRepository;
//
//import java.util.List;
//
//@AllArgsConstructor
//@RestController
//@RequestMapping("/redis")
//public class RedisController {
//    private final DocumentRepository documentRepository;
//
//    @GetMapping
//    public List<Document> list() {
//        List<Document> all = (List<Document>) documentRepository.findAll();
//        return all;
//    }
//
//    @GetMapping("/{id}")
//    public Document findMenuItemById(@PathVariable int id) {
//        return documentRepository.findItemById(id);
//    }
//
//    @PostMapping
//    public void create(@RequestBody Document menuDetails) {
//        documentRepository.save(menuDetails);
//    }
//}