package th.co.trainee.library.history;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import th.co.trainee.library.book.BookEntity;
import th.co.trainee.library.user.customer.CustomerEntity;
import th.co.trainee.library.user.librarian.LibrarianEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class HistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private int historyId;

    @JsonIgnore
    @NotNull(message = "book cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private BookEntity bookId;

    @JsonIgnore
    @NotNull(message = "librarian cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "librarian_id")
    private LibrarianEntity librarianId;

    @JsonIgnore
    @NotNull(message = "customer cannot be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerId;

    @NotNull(message = "borrow date cannot be null")
    @CreatedDate
    @Column(name = "Borrow_Date")
    private LocalDate localDateBorrow;

    @LastModifiedDate
    @Column(name = "Return_Date")
    private LocalDate localDateReturn;

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public BookEntity getBookId() {
        return bookId;
    }

    public void setBookId(BookEntity bookId) {
        this.bookId = bookId;
    }

    public LibrarianEntity getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(LibrarianEntity librarianId) {
        this.librarianId = librarianId;
    }

    public CustomerEntity getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerEntity customerId) {
        this.customerId = customerId;
    }

    public LocalDate getLocalDateBorrow() {
        return localDateBorrow;
    }

    public void setLocalDateBorrow(LocalDate localDateBorrow) {
        this.localDateBorrow = localDateBorrow;
    }

    public LocalDate getLocalDateReturn() {
        return localDateReturn;
    }

    public void setLocalDateReturn(LocalDate localDateReturn) {
        this.localDateReturn = localDateReturn;
    }
}
