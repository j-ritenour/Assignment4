package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=5)
    private String description;


    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public Skill(String aDescription) {
        super();
        this.description = aDescription;
    }



    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}