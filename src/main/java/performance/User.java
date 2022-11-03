package performance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="Users")
public class User {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  
	@NotNull private String username;
	@NotNull private String fullname;
	@NotNull private String password;
	@NotNull private Date create_time;
	
	@ManyToOne(targetEntity=Group.class)
	private Group group;
	
	@ManyToOne(targetEntity=Role.class)
	private Role role;

}
