package performance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="Jobs")
public class Job {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  
	@NotNull private String name;
	@NotNull private Date create_time;
	@NotNull private String status;
	@NotNull private String type;
	private String description;
	private Float difficulty;
	private Date evaluate_time;
	
	@NotNull @ManyToOne(targetEntity=User.class)
	private User creator;
	
	@ManyToOne(targetEntity=User.class)
	private User evaluator;
	
}
