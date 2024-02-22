package com.sau.project1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sau.project1.Entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    
}
