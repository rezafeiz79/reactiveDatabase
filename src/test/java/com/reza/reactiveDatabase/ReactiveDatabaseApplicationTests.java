package com.reza.reactiveDatabase;

import com.reza.reactiveDatabase.model.Document;
import com.reza.reactiveDatabase.model.DocumentPerson;
import com.reza.reactiveDatabase.model.Person;
import com.reza.reactiveDatabase.repository.DocumentPersonRepository;
import com.reza.reactiveDatabase.repository.DocumentRepository;
import com.reza.reactiveDatabase.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class ReactiveDatabaseApplicationTests {
	@Autowired
	private DocumentRepository documentRepository;
	@Autowired
	private DocumentPersonRepository documentPersonRepository;
	@Autowired
	private PersonRepository personRepository;
	@Test
	void contextLoads() {
		Document document1 = new Document("telegram", "internet");
		Document document2 = new Document("instagram", "media");
		Document document3 = new Document("facebook", "network");
		documentRepository
				.saveAll(Arrays.asList(document1, document2, document3))
				.blockLast();

		Person person1 = new Person("ali", "hasani");
		Person person2 = new Person("reza", "feiz");
		Person person3 = new Person("fateme", "hoseini");
		personRepository
				.saveAll(Arrays.asList(person1, person2, person3))
				.blockLast();

		DocumentPerson documentPerson1 = new DocumentPerson(1, 2);
		DocumentPerson documentPerson2 = new DocumentPerson(1, 3);
		DocumentPerson documentPerson3 = new DocumentPerson(2, 2);
		DocumentPerson documentPerson4 = new DocumentPerson(3, 1);
		documentPersonRepository
				.saveAll(Arrays.asList(documentPerson1, documentPerson2, documentPerson3, documentPerson4))
				.blockLast();

		documentRepository
				.findById(2)
				.map(document -> document.setSubject("updatedMedia"))
				.flatMap(documentRepository::save)
				.block();

		Document sampleDocument = documentRepository
				.findById(2).block();

		documentPersonRepository
				.findById(3)
				.map(documentPerson -> documentPerson.setDocumentId(3))
				.flatMap(documentPersonRepository::save)
				.block();
		DocumentPerson sampleDocumentPerson = documentPersonRepository
				.findById(3).block();
		assert sampleDocument.getSubject().equals("updatedMedia");
		assert sampleDocumentPerson.getDocumentId() == 3;
	}

}
