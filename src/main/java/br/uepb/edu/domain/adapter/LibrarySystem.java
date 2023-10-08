package br.uepb.edu.domain.adapter;

public class LibrarySystem {
    public static void main(String[] args) {
        OldBook oldVersionOfBook = new OldBookImpl("1984", "George Orwell", 328);

        // Usando o adaptador para adaptar a interface antiga à nova
        NewBook adaptedBook = new BookAdapter(oldVersionOfBook);

        System.out.println("Title: " + adaptedBook.getTitle());
        System.out.println("Author: " + adaptedBook.getAuthor());
        System.out.println("Pages: " + adaptedBook.getPageCount());
    }
}