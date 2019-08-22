package th.co.trainee.library.user.librarian;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/librarians")
public interface LibrarianRepository extends JpaRepository <LibrarianEntity,Integer> {
}
