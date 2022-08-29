package com.reza.reactiveDatabase.repository;

import com.reza.reactiveDatabase.model.Document;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DocumentRepository extends ReactiveCrudRepository<Document, Integer> {
}
