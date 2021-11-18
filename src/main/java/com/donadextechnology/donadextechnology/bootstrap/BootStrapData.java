package com.donadextechnology.donadextechnology.bootstrap;

import com.donadextechnology.donadextechnology.domain.Project;
import com.donadextechnology.donadextechnology.repositories.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {
    private final ProjectRepository projectRepository;

    public BootStrapData(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Project project1 = new Project("Donadex Web Management", "www.donadexwebmgt.com", "Learn how to build web app in Java", "background.jpg");
        projectRepository.save(project1);

        Project project2 = new Project("Donadex Fashion", "www.donadexfashion.com", "Learn how to style", "fashion.jpg");
        projectRepository.save(project2);


    }
}
