package br.com.coisasdejose.coisasdejosebackend.repository;

import br.com.coisasdejose.coisasdejosebackend.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
