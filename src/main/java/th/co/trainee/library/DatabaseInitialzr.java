package th.co.trainee.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import th.co.trainee.library.book.BookCategory;
import th.co.trainee.library.book.BookEntity;
import th.co.trainee.library.book.BookRepository;
import th.co.trainee.library.book.BookStatus;

import java.awt.print.Book;
import java.util.List;

@Component
public class DatabaseInitialzr implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        // Identify Book
        BookEntity bookEntity1 = new BookEntity("Stay Night","A01","Artoria", BookCategory.Comic, BookStatus.Available);
        BookEntity bookEntity2 = new BookEntity("Unlimited Blade Works","A02","Ishtar", BookCategory.Comic, BookStatus.Available);
        BookEntity bookEntity3 = new BookEntity("Heaven Feel","B01","Parvati", BookCategory.Novel, BookStatus.Available);

        // Add Book to List
        bookRepository.save(bookEntity1);
        bookRepository.save(bookEntity2);
        bookRepository.save(bookEntity3);
    }
}
