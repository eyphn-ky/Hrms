package kodlamaio.recapHrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.recapHrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

}
