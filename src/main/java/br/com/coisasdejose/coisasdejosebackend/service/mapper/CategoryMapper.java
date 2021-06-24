package br.com.coisasdejose.coisasdejosebackend.service.mapper;

import br.com.coisasdejose.coisasdejosebackend.domain.Category;
import br.com.coisasdejose.coisasdejosebackend.service.dto.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {

}
