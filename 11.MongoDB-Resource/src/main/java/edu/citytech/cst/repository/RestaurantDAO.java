package edu.citytech.cst.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import edu.citytech.cst.model.Restaurant;

public class RestaurantDAO {

	public List<Restaurant> findAll(Map<String, Object> query) {

		List<Restaurant> list = new ArrayList<>();
		
		Document filter = new Document();
		int limit = 10;
		
		if (query != null && query.containsKey("cuisine")) {
			Object value = query.get("cuisine");
			filter.append("cuisine", value);
		}
		
		if (query != null && query.containsKey("size")) {
			Object value = query.get("size");
			limit = (int) value;
		}

		Document projection = new Document()
				.append("name", true)
				.append("cuisine", true)
				.append("borough", true)
				.append("address.zipcode", true)
				.append("simpleId", true)
				.append("_id", false);

		MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
		MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase("food");
		MongoCollection<Document> collection = database.getCollection("restaurants");

		FindIterable<Document> documents = collection.find(filter).projection(projection).limit(limit);

		Gson gson = new Gson();
		for (Document document : documents) {
			String json = document.toJson();
			Restaurant restaurant = gson.fromJson(json, Restaurant.class);
			System.out.println(restaurant);
			list.add(restaurant);
		}

		mongoClient.close();
		return list;
	}

	public List<Restaurant> findAll() {
		return this.findAll(null);
	}

}
