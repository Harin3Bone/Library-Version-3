package th.co.trainee.library.user.librarian;

import th.co.trainee.library.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class LibrarianEntity extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int librarianId;

    public static LibrarianEntity create(@NotNull String userFirstName, @NotNull String userLastName,
                                        @NotNull String userName, @NotNull String userPassword) {
        var librarianEntity = new LibrarianEntity();
        librarianEntity.setUserFirstName(userFirstName);
        librarianEntity.setUserLastName(userLastName);
        librarianEntity.setUserName(userName);
        librarianEntity.setUserPassword(userPassword);
        return librarianEntity;
    }
}
