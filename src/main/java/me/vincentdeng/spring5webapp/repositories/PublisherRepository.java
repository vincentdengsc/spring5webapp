package me.vincentdeng.spring5webapp.repositories;

import me.vincentdeng.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
