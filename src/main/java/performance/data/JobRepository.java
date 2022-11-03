package performance.data;

import org.springframework.data.repository.CrudRepository;

import performance.Job;

public interface JobRepository extends CrudRepository<Job, Long> {

}
