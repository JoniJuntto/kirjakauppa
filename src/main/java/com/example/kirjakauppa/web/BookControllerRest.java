package com.example.kirjakauppa.web;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.kirjakauppa.domain.Book;
import com.example.kirjakauppa.domain.BookRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
public class BookControllerRest {

	@Autowired
	private BookRepository repository;
	
	@RequestMapping(value="/api" , method = RequestMethod.GET)
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy ="Book")
	public List<Book> book(){
		return (List<Book>) repository.findAll();
	}
	
	@RequestMapping(value="/api/{id}", method = RequestMethod.GET)
	public Optional<Book> findBookRest(@PathVariable("id") Long bookId){
		return repository.findById(bookId);
	}
	
	
}
