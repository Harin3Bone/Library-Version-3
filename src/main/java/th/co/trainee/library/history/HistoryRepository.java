package th.co.trainee.library.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/histories")
public interface HistoryRepository extends JpaRepository <HistoryEntity,Integer>{
    
}
