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
@Table(name="Pubscores")
public class Pubscore {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull private String period;
	@NotNull private Date score_time;
	
	@NotNull
	private Float score1, score2, score3, score4, score5, score6, score7, score8, total;
	
	@NotNull @ManyToOne(targetEntity=User.class)
	private User scoree;
	
	@NotNull @ManyToOne(targetEntity=User.class)
	private User scorer;
	
}
