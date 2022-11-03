package performance.data;

import org.springframework.data.rest.core.config.Projection;

import performance.Group;
import performance.Role;
import performance.User;

@Projection(name="userinfo", types={User.class}) 
public interface Userinfo {
	
	String getUsername();
	String getFullname();
	Group getGroup();
	Role getRole();

}
