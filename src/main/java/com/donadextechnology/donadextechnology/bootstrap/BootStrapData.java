package com.donadextechnology.donadextechnology.bootstrap;

import com.donadextechnology.donadextechnology.domain.Author;
import com.donadextechnology.donadextechnology.domain.Book;
import com.donadextechnology.donadextechnology.domain.Project;
import com.donadextechnology.donadextechnology.repositories.AuthorRepository;
import com.donadextechnology.donadextechnology.repositories.BookRepository;
import com.donadextechnology.donadextechnology.repositories.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {
    private final ProjectRepository projectRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(ProjectRepository projectRepository, AuthorRepository authorRepository, BookRepository bookRepository) {
        this.projectRepository = projectRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Project project1 = new Project("Donadex Web Management", "www.donadexwebmgt.com", "Learn how to build web app in Java", "background.jpg");
        projectRepository.save(project1);

        Project project2 = new Project("Donadex Fashion", "www.donadexfashion.com", "Learn how to style", "fashion.jpg");
        projectRepository.save(project2);


//        Author
        Author author1 = new Author("Sulaimon", "Ayodeji");
        Author author2 = new Author("Sulaimon", "Donald");

        authorRepository.save(author1);
        authorRepository.save(author2);



//        Book
        Book book1 = new Book("How To Build A Web App", "191121");
        bookRepository.save(book1);



    }
}
