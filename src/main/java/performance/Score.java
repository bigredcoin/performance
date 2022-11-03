package performance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Score {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull @ManyToOne(targetEntity=User.class)
	private User scoree;
	
	@NotNull @ManyToOne(targetEntity=User.class)
	private User scorer;
	
	@NotNull @OneToOne(targetEntity=Pubscore.class)
	private Pubscore pubscore;
	
	@NotNull @OneToOne(targetEntity=Jobscore.class)
	private Jobscore jobscore;
	
	private Float total;
	private Date score_time;

}
