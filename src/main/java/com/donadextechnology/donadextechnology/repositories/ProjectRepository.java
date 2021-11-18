package com.donadextechnology.donadextechnology.repositories;

import com.donadextechnology.donadextechnology.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
