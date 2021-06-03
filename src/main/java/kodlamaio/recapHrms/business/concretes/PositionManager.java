package kodlamaio.recapHrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.recapHrms.business.abstracts.PositionService;
import kodlamaio.recapHrms.dataAccess.abstracts.PositionDao;
import kodlamaio.recapHrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		// TODO Auto-generated method stub
		return this.positionDao.findAll();
	}
}
