package model;

public class Book {
    private int bookId;
    private String nameBook;
    private String nameAuthor;

    public Book(int bookId, String nameBook, String nameAuthor) {
        this.bookId = bookId;
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    public int getBookId() {
        return bookId;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", nameBook='" + nameBook + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                '}';
    }
}
