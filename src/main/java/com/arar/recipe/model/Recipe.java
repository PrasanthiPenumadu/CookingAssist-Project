package com.arar.recipe.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Recipes")
public class Recipe {
  @Id
  private String id;
  @NotEmpty
  private String author;
  @NotEmpty
  private String name;
  @NotEmpty
  private String description;
  private List<Ingredient> ingredients;
  private Integer prepTimeInSeconds;
  private Integer cookTimeInSeconds;
  private List<String> steps;

  public Recipe(){}

  public Recipe(String author,  String name, String description) {
    this.author = author;
    this.name = name;
    this.description = description;
  }

  public Recipe(String id, @NotEmpty String autho, @NotEmpty String name, @NotEmpty String description, List<Ingredient> ingredients, Integer prepTimeInSeconds, Integer cookTimeInSeconds, List<String> steps) {
    this.id = id;
    this.author = author;
    this.name = name;
    this.description = description;
    this.ingredients = ingredients;
    this.prepTimeInSeconds = prepTimeInSeconds;
    this.cookTimeInSeconds = cookTimeInSeconds;
    this.steps = steps;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
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

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }

  public Integer getPrepTimeInSeconds() {
    return prepTimeInSeconds;
  }

  public void setPrepTimeInSeconds(Integer prepTimeInSeconds) {
    this.prepTimeInSeconds = prepTimeInSeconds;
  }

  public Integer getCookTimeInSeconds() {
    return cookTimeInSeconds;
  }

  public void setCookTimeInSeconds(Integer cookTimeInSeconds) {
    this.cookTimeInSeconds = cookTimeInSeconds;
  }

  public List<String> getSteps() {
    return steps;
  }

  public void setSteps(List<String> steps) {
    this.steps = steps;
  }

}
