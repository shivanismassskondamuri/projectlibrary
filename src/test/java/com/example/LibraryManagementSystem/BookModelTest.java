package com.example.LibraryManagementSystem;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookModelTest {

    @Test
    void testBookModel() {
        BookModel bookModel = new BookModel();
        bookModel.setTitle("Book Title");
        bookModel.setAuthor("Author");
        bookModel.setAvailability(true);
        bookModel.setDepartments("computers");
        bookModel.setIsbn("1");
        bookModel.setGenre("comedy");
        bookModel.setPublicationYear(1999);
        Assertions.assertEquals("Book Title", bookModel.getTitle());
        Assertions.assertEquals("Author", bookModel.getAuthor());
        Assertions.assertTrue(bookModel.isAvailability());
        Assertions.assertEquals("computers", bookModel.getDepartments());
        Assertions.assertEquals("1", bookModel.getIsbn());
        Assertions.assertEquals("comedy", bookModel.getGenre());
        Assertions.assertEquals(1999, bookModel.getPublicationYear());
    }
}
