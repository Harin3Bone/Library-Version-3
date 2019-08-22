package th.co.trainee.library.user.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/customers")
public interface CustomerRepository extends JpaRepository <CustomerEntity,Integer> {
}
