package model.dao;

import java.util.List;

import model.entities.City;

public interface CityDao {
	void insert(City object);
	void delete(City object);
	void update(City object);
	City fyndById(int id);
	List<City> getAll();
	

}
