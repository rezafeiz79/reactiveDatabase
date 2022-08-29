CREATE TABLE document (id SERIAL PRIMARY KEY, title VARCHAR(255), subject VARCHAR(255));
CREATE TABLE person (id SERIAL PRIMARY KEY, first_name VARCHAR(255), last_name VARCHAR(255));
CREATE TABLE document_person (id SERIAL PRIMARY KEY, document_id VARCHAR(255), person_id VARCHAR(255));