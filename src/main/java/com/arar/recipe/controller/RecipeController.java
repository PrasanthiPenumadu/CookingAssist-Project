package com.arar.recipe.controller;

import com.arar.recipe.dao.RecipeRepository;
import com.arar.recipe.service.RecipeService;
import com.arar.recipe.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

  @Autowired
private RecipeRepository recipeRepository;

  @Autowired
  private RecipeService recipeService;

//  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
@GetMapping("/list")
  public ResponseEntity<Iterable<String>> getRecipeNames() {
    return new ResponseEntity<>(recipeService.getRecipeNames(), HttpStatus.OK);
  }

@CrossOrigin
@GetMapping("/by/{name}")
public ResponseEntity<Recipe> recipeByName(@PathVariable String name){
  return new ResponseEntity(recipeRepository.findByName(name),HttpStatus.OK);
}

  @CrossOrigin
  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Recipe> getAll() {
    return recipeService.getAll();
  }

  @CrossOrigin
  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity insert(@RequestBody Recipe recipe) {
    recipeService.insert(recipe);
    return ResponseEntity.ok(HttpStatus.OK);
  }
  @CrossOrigin
  @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity update(@RequestBody Recipe recipe) {
    recipeService.update(recipe);
    return ResponseEntity.ok(HttpStatus.OK);
  }
  @CrossOrigin
  @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity delete(@RequestParam String id) {
    recipeService.delete(id);
    return ResponseEntity.ok(HttpStatus.OK);
  }
}
