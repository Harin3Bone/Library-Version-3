package th.co.trainee.library.book;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int bookId;

    @NotNull
    @Column(name = "Name")
    private String bookName;

    @NotNull
    @Column(name = "Code")
    private String bookCode;

    @NotNull
    @Column(name = "Author")
    private String bookAuthor;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "Category")
    private BookCategory bookCategory;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private BookStatus bookStatus;

    public BookEntity(){

    }

    public BookEntity(@NotNull String bookName, @NotNull String bookCode, @NotNull String bookAuthor,
                      @NotNull BookCategory bookCategory, @NotNull BookStatus bookStatus) {
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
