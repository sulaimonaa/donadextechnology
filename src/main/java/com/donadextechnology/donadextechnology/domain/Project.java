package com.donadextechnology.donadextechnology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String projectTitle;
    private String projectLink;
    private String projectDescription;
    private String projectImage;
    
    public Project(){
        
    }

    public Project(String projectTitle, String projectLink, String projectDescription, String projectImage){
        this.projectTitle = projectTitle;
        this.projectLink = projectLink;
        this.projectDescription = projectDescription;
        this.projectImage = projectImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectTitle='" + projectTitle + '\'' +
                ", projectLink='" + projectLink + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectImage='" + projectImage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
