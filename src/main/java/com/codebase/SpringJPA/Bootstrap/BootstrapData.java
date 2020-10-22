package com.codebase.SpringJPA.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.codebase.SpringJPA.domain.Author;
import com.codebase.SpringJPA.domain.Book;
import com.codebase.SpringJPA.domain.Publisher;
import com.codebase.SpringJPA.repositories.AuthorRepository;
import com.codebase.SpringJPA.repositories.BookRepository;
import com.codebase.SpringJPA.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {
	
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	



	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}




	/**
	 * @return the authorRepository
	 */
	public AuthorRepository getAuthorRepository() {
		return authorRepository;
	}




	/**
	 * @return the publisherRepository
	 */
	public PublisherRepository getPublisherRepository() {
		return publisherRepository;
	}




	/**
	 * @return the bookRepository
	 */
	public BookRepository getBookRepository() {
		return bookRepository;
	}




	@Override
	public void run(String... args) throws Exception{
	
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		Publisher publisher = new Publisher("Penguin House", "New York");
		
		
		
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		publisher.getName();
		
		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);
		
	//	authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB","313244245");
		
	//	authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	//	rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		publisherRepository.save(publisher);
		
		
		
		System.out.println("Started in Bootstrap");
		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Publisher House is: " + publisher.getName() + " and the City is: "+ publisher.getCity());
		System.out.println("Publisher Number of Books: " + publisher.getBooks().size() );
	//	System.out.println("Number of Authors " + authorRepository.count());
		
		
	}
}
