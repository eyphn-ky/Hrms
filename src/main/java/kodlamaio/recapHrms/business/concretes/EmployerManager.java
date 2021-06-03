package kodlamaio.recapHrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.recapHrms.business.abstracts.EmployerService;
import kodlamaio.recapHrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.recapHrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
 
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
