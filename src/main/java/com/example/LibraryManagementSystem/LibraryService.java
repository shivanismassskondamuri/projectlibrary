package com.example.LibraryManagementSystem;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    List<BookModel> bookList=new ArrayList<>();

    public List<BookModel> addBook(BookModel book){
        bookList.add(book);
        return bookList;
    }
    public List<BookModel> removeBook(String isbn){
        int flag=0;
        for(BookModel book:bookList){
            if(book.getIsbn().equals(isbn)){
                flag=1;
                bookList.remove(book);
                return bookList;
            }
        }
       return null;
    }
    public BookModel findBookByTitle(String title){
        int flag=0;
        for(BookModel book:bookList){
            if(book.getTitle().equals(title)){
                flag=1;
                return book;
            }
        }
        return null;
    }
    public BookModel findBookByAuthor(String author){
        int flag=0;
        for(BookModel book:bookList){
            if(book.getAuthor().equals(author)){
                flag=1;
                return book;
            }
        }
        return null;
    }
    public List<BookModel> listAllBooks(){
        return bookList;
    }
    public List<BookModel> listAvailableBooks(){
        List<BookModel> list=new ArrayList<>();
        for(BookModel book:bookList){
            if(book.isAvailability()==true){
                list.add(book);
            }
        }
        return list;
    }
}
