package kodlamaio.hrmsApp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_positions")
@Data
@AllArgsConstructor //constructure ve getter setter oluşturuyor
@NoArgsConstructor
public class JobPositions  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_explanation",unique = true)
	private String jobExplanation;
	
	//public Product() {}
		
	
	
	
	
	
	
}
	
	
	
	


