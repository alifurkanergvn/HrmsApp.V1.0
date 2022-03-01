package kodlamaio.hrmsApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.JobPositions;

public interface JobDao extends JpaRepository<JobPositions, Integer>{
	
	JobPositions findByJobExplanation(String jobExplanation);
}
