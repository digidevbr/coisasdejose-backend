package br.com.coisasdejose.coisasdejosebackend.service;

import br.com.coisasdejose.coisasdejosebackend.repository.CategoryRepository;
import br.com.coisasdejose.coisasdejosebackend.service.dto.CategoryDTO;
import br.com.coisasdejose.coisasdejosebackend.service.mapper.CategoryMapper;
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

    private final CategoryMapper categoryMapper;

    public  CategoryService(CategoryRepository categoryRepository,
                            CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){
        log.debug("Find all category ok.");
        List<CategoryDTO> categoryDTOList = categoryMapper.toDTO(categoryRepository.findAll());
        categoryDTOList.forEach(categoryDTO -> {
            categoryDTO.setRecipesCount(1);
        });
        return categoryDTOList;
    }
}
