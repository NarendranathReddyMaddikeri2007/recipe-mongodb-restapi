package com.mongodbrecipe.recipe.service;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mongodbrecipe.recipe.model.Recipe;
import com.mongodbrecipe.recipe.repository.RecipeRepository;

@Service
public class RecipeService {
         
	@Autowired
	private RecipeRepository repository;
	//CREATE, READ, UPDATE, DELETE
	//-----------------------------------
	//CREATE
	public Recipe addTask(Recipe recipe) {
		//need addition of toString().split("-")[0]);
		recipe.setId(UUID.randomUUID().toString());
		return repository.save(recipe);
	}
	//-----------------------------------
	//READ
	public List<Recipe> getAllRecipes() {
		return repository.findAll();
	}
	//-----------------------------------
	//UPDATE
	public Recipe updateRecipe(Recipe recipeRequest) {
		Recipe existingRecipe =  repository.findById(recipeRequest.getId()).get();
	    existingRecipe.setDescription(recipeRequest.getDescription());
	    existingRecipe.setName(recipeRequest.getName());
	    existingRecipe.setTags(recipeRequest.getTags());
	    existingRecipe.setIngredients(recipeRequest.getIngredients());
	    existingRecipe.setProcess(recipeRequest.getProcess());
		return repository.save(existingRecipe);
	}
	//-----------------------------------
	//DELETE
	public String deleteRecipe(String recipeId) {
		repository.deleteById(recipeId);
		return "task - "+recipeId+"deleted";
	}
	//-----------------------------------
}
