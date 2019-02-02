package repositories.SingleEvent;

import models.SingleEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleEventRepository extends JpaRepository<SingleEvent, Long>, SingleEventRepositoryCustom {
}
