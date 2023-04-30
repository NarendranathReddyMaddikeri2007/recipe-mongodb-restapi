package com.mongodbrecipe.recipe.model;

import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="recipes")
public class Recipe {
     
	
	@Id	
	private String id;
	private String name;
	private String description;
	private List<String> tags;
	private List<String> ingredients;
	private String process;
	
	
	public Recipe() {
		super();
	}

	public Recipe(String id, String name, String description, List<String> tags, List<String> ingredients,
			String process) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.tags = tags;
		this.ingredients = ingredients;
		this.process = process;
	}

	public Recipe(String name, String description, List<String> tags, List<String> ingredients, String process) {
		super();
		this.name = name;
		this.description = description;
		this.tags = tags;
		this.ingredients = ingredients;
		this.process = process;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}


}
