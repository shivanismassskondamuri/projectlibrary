package com.example.LibraryManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @PostMapping(path="/addBook",produces = "application/json")
    public List<BookModel> addBook(@RequestBody BookModel book){
return libraryService.addBook(book);
    }

    @DeleteMapping(path="removeBook/{isbn}",produces = "application/json")
    public List<BookModel> removeBook(@PathVariable String isbn){
return libraryService.removeBook(isbn);
    }

    @GetMapping(path="findBookByTitle/{title}",produces = "application/json")
    public BookModel findBookByTitle(@PathVariable String title){
        return libraryService.findBookByTitle(title);
    }

    @GetMapping(path="findBookByAuthor/{author}",produces = "application/json")
    public BookModel findBookByAuthor(@PathVariable String author){
return libraryService.findBookByAuthor(author);
    }

    @GetMapping(path="/listAllBooks",produces = "application/json")
    public List<BookModel> listAllBooks(){
    return libraryService.listAllBooks();
    }

    @GetMapping(path ="/listAvailableBooks",produces = "application/json")
    public List<BookModel> listAvailableBooks(){
    return  libraryService.listAvailableBooks();
    }

}
