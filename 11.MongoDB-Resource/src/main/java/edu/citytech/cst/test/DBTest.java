package edu.citytech.cst.test;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import edu.citytech.cst.model.Restaurant;

public class DBTest {

	public static void main(String[] args) {
		
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
		
		FindIterable<Document> documents = collection.find().projection(projection).limit(10);
		
		Gson gson = new Gson();
		for (Document document : documents) {
			String json = document.toJson();
			Restaurant restaurant = gson.fromJson(json, Restaurant.class);
			System.out.println(restaurant);
		}
		
		mongoClient.close();
	}

}
