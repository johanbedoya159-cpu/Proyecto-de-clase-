package co.edu.uco.nose.data.dao.entity;

import java.util.List;
import java.util.UUID;

import co.edu.uco.nose.data.dao.RetrieveDao;
import co.edu.uco.nose.dto.IdTypeDto;
import co.edu.uco.nose.entity.IdTypeEntity;

public interface IdTypeDao extends RetrieveDao<IdTypeEntity, UUID>  {

	List<IdTypeDto> findByFilter(IdTypeDto filterEntity);
	

}
