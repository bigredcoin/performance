package performance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="Jobscores")
public class Jobscore {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull private Date create_time;
	@NotNull private String status;
	private Date score_time;
	private Float total;

	@NotNull @ManyToOne(targetEntity=User.class)
	private User scoree;
	
	@ManyToOne(targetEntity=User.class)
	private User scorer;

	@OneToMany(targetEntity=Jobscoreitem.class)
	private List<Jobscoreitem> items = new ArrayList<>();
	
}
