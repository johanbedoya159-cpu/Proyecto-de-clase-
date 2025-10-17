package co.edu.uco.nose.data.dao.factory;

import java.sql.Connection;

import co.edu.uco.nose.data.dao.entity.CityDao;
import co.edu.uco.nose.data.dao.entity.CountryDao;
import co.edu.uco.nose.data.dao.entity.IdTypeDao;
import co.edu.uco.nose.data.dao.entity.StateDao;
import co.edu.uco.nose.data.dao.entity.UserDao;

public abstract class DaoFactory {
	
	protected Connection connection;
	
	protected FactoryEnum factory = FactoryEnum.POSTGRESQL;
	
	public static DaoFactory getFactory() {
		return null;
	}
	
	public abstract CityDao getCityDAO();
	
	public abstract CountryDao getCountryDAO();
	
	public abstract IdTypeDao getIdTypeDAO();
	
	public abstract StateDao getStateDAO();
	
	public abstract UserDao getUserDAO();
	
	protected abstract void openConnection();
	
	protected final void initTransaction(){}
	
	protected final void commitTransaction(){}
	
	protected final void rollbackTransaction(){}
	
	protected final void closeConnection(){}

}
