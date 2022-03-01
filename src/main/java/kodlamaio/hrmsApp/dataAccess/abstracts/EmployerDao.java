package kodlamaio.hrmsApp.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsApp.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	Employer findByEmail(String emailString);

}
