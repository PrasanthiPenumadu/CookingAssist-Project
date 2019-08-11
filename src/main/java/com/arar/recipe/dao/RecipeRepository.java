package com.arar.recipe.dao;

import com.arar.recipe.model.Recipe;
import com.arar.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {


  Optional<Recipe> findById(String id);
  List<Recipe> findAll();
  Recipe save(Recipe recipe);
  void delete(Recipe recipe);
  void deleteById(String id);
  Recipe findByName(String name);

}
