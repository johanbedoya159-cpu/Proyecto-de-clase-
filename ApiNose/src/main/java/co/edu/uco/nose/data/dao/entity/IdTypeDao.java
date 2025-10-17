package co.edu.uco.nose.data.dao.entity;

import java.util.List;
import java.util.UUID;

import co.edu.uco.nose.data.dao.RetrieveDao;
import co.edu.uco.nose.dto.IdTypeDto;

public interface IdTypeDao extends RetrieveDao<IdTypeDao, UUID>  {

	List<IdTypeDto> findByFilter(IdTypeDto filterEntity);
	

}
