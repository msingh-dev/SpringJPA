package com.codebase.SpringJPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codebase.SpringJPA.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
