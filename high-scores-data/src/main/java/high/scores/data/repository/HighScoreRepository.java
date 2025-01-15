package high.scores.data.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import high.scores.data.entity.HighScoreEntity;

@Repository
public interface HighScoreRepository extends JpaSpecificationExecutor<HighScoreEntity> {
}