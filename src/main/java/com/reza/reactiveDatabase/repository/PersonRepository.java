package com.reza.reactiveDatabase.repository;

import com.reza.reactiveDatabase.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person, Integer> {
}
