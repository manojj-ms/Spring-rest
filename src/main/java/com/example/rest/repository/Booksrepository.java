package com.example.rest.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.rest.model.Books;
public interface Booksrepository extends CrudRepository<Books, Integer>   {

}
