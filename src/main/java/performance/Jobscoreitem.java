package performance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Jobscoreitem {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull @ManyToOne(targetEntity=Job.class)
	private Job job;
	
	private String goal;
	private String achivement;
	private Float man_day;
	private Float score;
	private Float weighted_score;
	private Boolean valid;

}
