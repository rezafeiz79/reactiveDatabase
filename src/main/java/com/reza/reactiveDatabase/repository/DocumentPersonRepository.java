package com.reza.reactiveDatabase.repository;

import com.reza.reactiveDatabase.model.DocumentPerson;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DocumentPersonRepository extends ReactiveCrudRepository<DocumentPerson, Integer> {
}
