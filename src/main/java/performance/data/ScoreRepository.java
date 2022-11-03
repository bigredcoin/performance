package performance.data;

import org.springframework.data.repository.CrudRepository;

import performance.Score;

public interface ScoreRepository extends CrudRepository<Score, Long> {

}
