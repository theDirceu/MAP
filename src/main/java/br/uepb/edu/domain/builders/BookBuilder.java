package br.uepb.edu.domain.builders;

class BookBuilder {
    private String title;

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book build() {
        return new Book(title);
    }
}
