package repositories.MultiEvent;

import models.MultiEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultiEventRepository extends JpaRepository<MultiEvent, Long>, MultiEventRepositoryCustom {
}
