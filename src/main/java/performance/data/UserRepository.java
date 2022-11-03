package performance.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import performance.User;

@RepositoryRestResource(excerptProjection = Userinfo.class)
public interface UserRepository extends CrudRepository<User, Long> {

}
