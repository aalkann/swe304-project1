package com.sau.project1.Service;

import java.util.List;
import com.sau.project1.Entity.Person;

public interface PersonService {

    Person save(Person person);

    List<Person> getAll();

    Person update(Person person);

    void delete(Long id);

}
