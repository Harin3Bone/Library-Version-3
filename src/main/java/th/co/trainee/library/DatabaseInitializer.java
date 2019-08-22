package th.co.trainee.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import th.co.trainee.library.book.BookCategory;
import th.co.trainee.library.book.BookEntity;
import th.co.trainee.library.book.BookRepository;
import th.co.trainee.library.book.BookStatus;
import th.co.trainee.library.user.customer.CustomerEntity;
import th.co.trainee.library.user.customer.CustomerRepository;
import th.co.trainee.library.user.librarian.LibrarianEntity;
import th.co.trainee.library.user.librarian.LibrarianRepository;

import java.awt.print.Book;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LibrarianRepository librarianRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        // Specify Book
        var bookEntity1 = BookEntity.create("Stay Night","A01","Artoria", BookCategory.Comic, BookStatus.Available);
        var bookEntity2 = BookEntity.create("Unlimited Blade Works","A02","Ishtar", BookCategory.Comic, BookStatus.Available);
        var bookEntity3 = BookEntity.create("Heaven Feel","B01","Parvati", BookCategory.Novel, BookStatus.Available);

        // Add Book to BookList
        bookRepository.save(bookEntity1);
        bookRepository.save(bookEntity2);
        bookRepository.save(bookEntity3);

        // Specify Librarian
        var librarianEntity1 = LibrarianEntity.create("Zchwazer","Zchwarzlanky","1111","1111");

        // Add Librarian to LibrarianList
        librarianRepository.save(librarianEntity1);

        // Specify Customer
        var customerEntity1 = CustomerEntity.create("Atago","Kashiwakaze","2222","2222");
        var customerEntity2 = CustomerEntity.create("Takao","Ushiwakaze","3333","3333");

        // Add Customer to CustomerList
        customerRepository.save(customerEntity1);
        customerRepository.save(customerEntity2);
    }
}
