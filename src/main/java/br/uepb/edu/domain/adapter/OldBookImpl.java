package br.uepb.edu.domain.adapter;

public class OldBookImpl implements Oldbook {
    private String title;
    private String author;
    private int pages;

    public OldBookImpl(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getTitleAndAuthor() {
        return title + " by " + author;
    }

    @Override
    public int getNumberOfPages() {
        return pages;
    }
}
