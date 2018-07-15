package me.vincentdeng.spring5webapp.repositories;

import me.vincentdeng.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
