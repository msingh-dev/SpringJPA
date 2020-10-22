package com.codebase.SpringJPA.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String addressLine1;
	private String City;
	private String State;
	private Long zip;
	
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "publisher_id")
	private Set<Book> books = new HashSet<>();
	
	
	
	public Publisher() {
		super();
	}
	
	
	
	


	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}






	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}






	public Publisher(String name, String city) {
		super();
		this.name = name;
		City = city;
	}





	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}





	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the zip
	 */
	public Long getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(Long zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Publisher [name=" + name + ", addressLine1=" + addressLine1 + ", City=" + City + ", State=" + State
				+ ", zip=" + zip + "]";
	}





	@Override
	public int hashCode() {
		return Objects.hash(id);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Publisher other = (Publisher) obj;
		return Objects.equals(id, other.id);
	}
	
	
	


	
	
}
