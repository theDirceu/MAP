package br.uepb.edu.domain.adapter;

public class BookAdapter implements NewBook {
    private Oldbook oldBook;

    public BookAdapter(Oldbook oldBook) {
        this.oldBook = oldBook;
    }

    @Override
    public String getTitle() {
        return oldBook.getTitleAndAuthor().split(" by ")[0];
    }

    @Override
    public String getAuthor() {
        return oldBook.getTitleAndAuthor().split(" by ")[1];
    }

    @Override
    public int getPageCount() {
        return oldBook.getNumberOfPages();
    }
}
