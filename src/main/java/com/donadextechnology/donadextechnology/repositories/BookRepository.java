package com.donadextechnology.donadextechnology.repositories;
import com.donadextechnology.donadextechnology.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
