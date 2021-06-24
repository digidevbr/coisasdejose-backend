package br.com.coisasdejose.coisasdejosebackend.web.rest;

import br.com.coisasdejose.coisasdejosebackend.service.CategoryService;
import br.com.coisasdejose.coisasdejosebackend.service.dto.CategoryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategoryController {

    private final Logger log = LoggerFactory.getLogger(CategoryController.class);

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        log.debug("REST get all categories");
        return ResponseEntity.ok(categoryService.findAll());
    }
}
