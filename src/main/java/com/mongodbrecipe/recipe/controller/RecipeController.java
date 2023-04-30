package com.mongodbrecipe.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbrecipe.recipe.model.Recipe;
import com.mongodbrecipe.recipe.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	  @Autowired
      private RecipeService service;
	  
	  //CREATE 
	  //http://localhost:8080/recipes
	  @PostMapping
	  @ResponseStatus(HttpStatus.CREATED)
	  public Recipe createRecipe(@RequestBody Recipe recipe) {
		  return service.addTask(recipe);  
	  }
	  
	  //READ 
	  //http://localhost:8080/recipes
	  @GetMapping()
	  public List<Recipe> getRecipe(){
		  return service.getAllRecipes();
	  }
	  
	  //UPDATE 
	  //http://localhost:8080/recipes
	  @PutMapping
	  public Recipe modifyTask(@RequestBody Recipe recipe) {
			return service.updateRecipe(recipe);
	  }
		
	  //DELETE 
	  //http://localhost:8080/recipes/{recipeId}
	  @DeleteMapping("/{recipeId}")
	  public String deleteRecipe(@PathVariable String recipeId) {
			return service.deleteRecipe(recipeId);
	  }
	  
}
