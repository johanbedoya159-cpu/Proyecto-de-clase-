package co.edu.uco.nose.data.dao.entity;

import java.util.UUID;

import co.edu.uco.nose.data.dao.CreateDao;
import co.edu.uco.nose.data.dao.DeleteDao;
import co.edu.uco.nose.data.dao.RetrieveDao;
import co.edu.uco.nose.data.dao.UpdateDao;
import co.edu.uco.nose.entity.UserEntity;

public interface UserDao extends CreateDao<UserEntity>, RetrieveDao<UserEntity, UUID>, UpdateDao<UserEntity>, DeleteDao<UUID>{
	
}
