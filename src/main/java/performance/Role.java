package performance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="Roles")
public class Role {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  
	@NotNull private String name;	
	@NotNull private Boolean valid;

}
