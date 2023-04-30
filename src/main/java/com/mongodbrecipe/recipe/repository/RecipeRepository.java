package com.mongodbrecipe.recipe.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodbrecipe.recipe.model.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe,String>{
	
	
}
