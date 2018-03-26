package Skiff.dao;

import java.util.List;

import edu.nju.hello_order.temp_model.Places;
import edu.nju.hello_order.temp_model.Route;
import edu.nju.hello_order.temp_model.RoutePlan;

public interface RouteDao {
	
	public List<Route> getRouteByUser(String uid);
	
	public List<Route> getRouteByCond(String city,int day);
	
	public int addRoute(Route route);
	
	public int deleteRoute(int id);
	
	public int deletePlan(int id);
	
	public int addPlan(RoutePlan plan);
	
	public List<Places> getAllPlaces();
	
	public Places getPlacesByID(int id);
	
	public List<Places> getPlacesByCond(String name,String city,String type,String addr);
	
	public int addPlaces(Places places);
	
	public int deletePlaces(int id);
	
	public int modPlaces(Places place);

}
