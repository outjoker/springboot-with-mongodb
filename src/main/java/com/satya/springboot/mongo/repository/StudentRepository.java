package com.satya.springboot.mongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.satya.springboot.mongo.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	

}
