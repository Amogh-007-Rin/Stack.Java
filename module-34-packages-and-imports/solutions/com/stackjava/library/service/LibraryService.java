package com.stackjava.library.service;

import com.stackjava.library.model.Book;

public class LibraryService {
    public void checkoutBook(Book b) {
        System.out.println("Checking out: " + b.getTitle() + " by " + b.getAuthor());
    }
}
