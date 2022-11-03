package performance.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import performance.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	public Role findByName(@Param("name") String name);
	
}
