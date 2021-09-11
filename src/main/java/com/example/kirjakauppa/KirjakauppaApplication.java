package com.example.kirjakauppa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.kirjakauppa.domain.Book;
import com.example.kirjakauppa.domain.BookRepository;

@SpringBootApplication
public class KirjakauppaApplication {
	private static final Logger log = LoggerFactory.getLogger(KirjakauppaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(KirjakauppaApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookStore(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Joni Juntto", 1111, "The kirja", 2020));
			repository.save(new Book("Joni Juntto", 1234, "The kirja 2", 2021));	
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
