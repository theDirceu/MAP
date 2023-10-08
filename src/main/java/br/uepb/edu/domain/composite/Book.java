package br.uepb.edu.domain.composite;

import java.util.ArrayList;
import java.util.List;

interface LibraryItem {
    void display();
}

class Book implements LibraryItem {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title);
    }
}

class Category implements LibraryItem {
    private String name;
    private List<LibraryItem> items = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void add(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (LibraryItem item : items) {
            item.display();
        }
    }
}
