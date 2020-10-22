package com.codebase.SpringJPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codebase.SpringJPA.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
