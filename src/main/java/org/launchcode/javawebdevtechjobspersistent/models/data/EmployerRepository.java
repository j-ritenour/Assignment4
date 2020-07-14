package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//where data is stored(bc CrudRepository is magical)

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
