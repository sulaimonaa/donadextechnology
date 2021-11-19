package com.donadextechnology.donadextechnology.repositories;

import com.donadextechnology.donadextechnology.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
