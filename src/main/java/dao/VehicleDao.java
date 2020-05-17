package dao;

import java.util.List;

import entities.Vehicle;

public interface VehicleDao {

	public void insert(Vehicle vehicle);
	public void update(Vehicle vehicle);
	public void remove(String license);
	public Vehicle findAvehicle(String license);
	public List<Vehicle> findAll();
}