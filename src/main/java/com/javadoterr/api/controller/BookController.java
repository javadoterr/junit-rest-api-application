package com.javadoterr.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadoterr.api.repo.BookRepository;

@RestController
@RequestMapping(path = "/book")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	
	

}
