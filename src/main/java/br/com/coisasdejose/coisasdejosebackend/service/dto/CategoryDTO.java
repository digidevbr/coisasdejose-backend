package br.com.coisasdejose.coisasdejosebackend.service.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 6467548314293396282L;

    private Long id;

    private String name;

    private Integer recipesCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecipesCount() {
        return recipesCount;
    }

    public void setRecipesCount(Integer recipesCount) {
        this.recipesCount = recipesCount;
    }
}
