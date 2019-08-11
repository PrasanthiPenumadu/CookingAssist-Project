package com.arar.recipe.service;

import com.arar.recipe.dao.RecipeRepository;
import com.arar.recipe.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RecipeService {
  @Autowired
  private RecipeRepository recipeRepository;

  public List<Recipe> getAll() {
    List<Recipe> recipeList = new ArrayList<>();
    Iterable<Recipe> recipes = recipeRepository.findAll();
    recipes.forEach(recipeList::add);
    return recipeList;
  }
 public List<String> getRecipeNames(){
   List<String> recipeNames=new ArrayList<>();
   for (Recipe r:recipeRepository.findAll()) {
     recipeNames.add(r.getName());
   }
     return recipeNames;
 }

  public void insert(Recipe recipe) {
    recipeRepository.save(recipe);
  }

  public void update(Recipe recipe) {
    recipeRepository.save(recipe);
  }

  public void delete(@RequestParam String id) {
    recipeRepository.deleteById(id);
  }

}
