package com.revature.appbook;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
  
  @Autowired
  BookRepository br;
  
  @GetMapping("/hello")
  public String hello() {
    return "hello books";
  }
  
  @GetMapping
  public List<Book> getAll() {
    return br.findAll();
  }
  
  @GetMapping("/{id}")
  public Book getById(@PathVariable Integer id) {
    Optional<Book> repositoryResult = br.findById(id);
    if (repositoryResult.isPresent()) {
      return repositoryResult.get();
    } else {
      return null;
    }
  }
  
  @PostMapping
  public Book addBook(Book book) {
    return br.save(book);
  }
}
