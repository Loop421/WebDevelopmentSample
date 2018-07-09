package edu.citytech.cst.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.citytech.cst.model.Restaurant;
import edu.citytech.cst.repository.RestaurantDAO;

public class _Driver1 {

	public static void main(String[] args) {
		
		RestaurantDAO dao = new RestaurantDAO();
		
		List<Restaurant> list = dao.findAll();
		
		Map<String, Object> query = new HashMap<>();
		query.put("cuisine", "American");
		query.put("size", 100);
		
		
		List<Restaurant> listByCuisine = dao.findAll(query);
		
		
		
		
	}

}
