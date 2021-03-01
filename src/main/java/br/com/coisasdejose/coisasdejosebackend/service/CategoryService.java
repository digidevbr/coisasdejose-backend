package br.com.coisasdejose.coisasdejosebackend.service;

import br.com.coisasdejose.coisasdejosebackend.domain.Category;
import br.com.coisasdejose.coisasdejosebackend.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final Logger log = LoggerFactory.getLogger(CategoryService.class);

    private final CategoryRepository categoryRepository;

    public  CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional(readOnly = true)
    public List<Category> findAll(){
        log.debug("Find all category ok.");
        return categoryRepository.findAll();
    }
}
