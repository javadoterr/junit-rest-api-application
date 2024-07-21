package com.javadoterr.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javadoterr.api.bean.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
