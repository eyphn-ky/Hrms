package kodlamaio.recapHrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.recapHrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer> {

}
