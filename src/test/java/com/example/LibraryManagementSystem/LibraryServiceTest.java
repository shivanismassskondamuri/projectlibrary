package com.example.LibraryManagementSystem;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class LibraryServiceTest {

    @InjectMocks
    LibraryService libraryService;

    List<BookModel> bookModels=new ArrayList<>();

    @Test
    void testaddBook(){
        BookModel bookModel=new BookModel();
        bookModel.setIsbn("1");
        bookModel.setAuthor("Author");
        bookModel.setTitle("Title");
        Assertions.assertEquals(1,libraryService.addBook(bookModel).size());
    }

    @Test
    void testRemoveBook(){
        BookModel bookModel=new BookModel();
        bookModel.setIsbn("1");
        bookModel.setAuthor("Author");
        bookModel.setTitle("Title");
        Assertions.assertEquals(null,libraryService.removeBook("1"));
    }

    @Test
    void testFindBookByTitle(){
        BookModel bookModel=new BookModel();
        bookModel.setIsbn("1");
        bookModel.setAuthor("Author");
        bookModel.setTitle("Title");
        Assertions.assertEquals(null,libraryService.findBookByTitle("Title"));
    }

    @Test
    void testFindBookByAuthor(){
        BookModel bookModel=new BookModel();
        bookModel.setIsbn("1");
        bookModel.setAuthor("Author");
        bookModel.setTitle("Title");
        Assertions.assertEquals(null,libraryService.findBookByAuthor("Title"));
    }
    @Test
    void testListAllBooks(){
        BookModel bookModel=new BookModel();
        bookModel.setIsbn("1");
        bookModel.setAuthor("Author");
        bookModel.setTitle("Title");
        Assertions.assertEquals(0,libraryService.listAllBooks().size());
    }
}
