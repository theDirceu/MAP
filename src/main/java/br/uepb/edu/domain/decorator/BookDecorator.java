package br.uepb.edu.domain.decorator;

import br.uepb.edu.domain.*;

abstract class BookDecorator implements LibraryItem {
    protected LibraryItem book;

    public BookDecorator(LibraryItem book) {
        this.book = book;
    }

    @Override
    public void display() {
        book.display();
    }
}

class ReservedBook extends BookDecorator {
    public ReservedBook(LibraryItem book) {
        super(book);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Status: Reserved");
    }
}

