package com.JMDF.JhonMarioHttp.repository;


import com.JMDF.JhonMarioHttp.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

}
