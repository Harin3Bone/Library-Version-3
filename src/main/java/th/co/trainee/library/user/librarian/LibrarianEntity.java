package th.co.trainee.library.user.librarian;

import th.co.trainee.library.user.User;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "librarian")
public class LibrarianEntity extends User {

}
