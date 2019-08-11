package com.arar.recipe.dao;

import com.arar.recipe.model.Ingredient;
import com.arar.recipe.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class InitDao implements CommandLineRunner {

  @Autowired
  private RecipeRepository recipeRepository;


  @Override
  public void run(java.lang.String... args) throws Exception {

    recipeRepository.deleteAll();

    List<java.lang.String> stepsMS = Arrays.asList("Gather the ingredients.", "Blend them all together.",
            "Pour it and serve...Yummy Smoothy Mango shake!");
    List<Ingredient> ingredientListMS = Arrays.asList(new Ingredient("Mango Pulp", "1/2", "cup"),
            new Ingredient("Milk", "1", "cup"), new Ingredient("Sugar", "1", "TableSpoon"), new Ingredient("Whipped Cream", "1", "scoop"));
    recipeRepository.save(new Recipe("1", "Prasanthi", "MangoMilkShake", "cool and soothing fruit drink",
            ingredientListMS, 600, 300, stepsMS));

    List<java.lang.String> stepsBS = Arrays.asList("Gather the ingredients.", "Blend them all together.",
            "Pour it and serve...Yummy Smoothy Banana shake!");
    List<Ingredient> ingredientListBS = Arrays.asList(new Ingredient("Bananas", "1", "Banana"),
            new Ingredient("Milk", "1", "cup"), new Ingredient("Sugar", "1", "TableSpoon"), new Ingredient("Whipped Cream", "1", "scoop"));
    recipeRepository.save(new Recipe("2", "Prasanthi",  "BananaMilkShake", "cool and soothing fruit drink",
            ingredientListBS, 600, 300, stepsBS));

    List<java.lang.String> stepsAS = Arrays.asList("Gather the ingredients.", "Blend them all together.",
            "Pour it and serve...Yummy Smoothy Avacado shake!");
    List<Ingredient> ingredientListAS = Arrays.asList(new Ingredient("Avacadoes", "1", "avacado"),
            new Ingredient("Milk", "1", "cup"), new Ingredient("Sugar", "1", "TableSpoon"), new Ingredient("Whipped Cream", "1", "scoop"));
    recipeRepository.save(new Recipe("3", "Prasanthi",  "AvacadoMilkShake", "cool and soothing fruit drink",
            ingredientListAS, 600, 300, stepsAS));

    List<java.lang.String> stepsApS = Arrays.asList("Gather the ingredients.", "Blend them all together.",
            "Pour it and serve...Yummy Smoothy Apple shake!");
    List<Ingredient> ingredientListApS = Arrays.asList(new Ingredient("Apple", "1", "Apple"),
            new Ingredient("Milk", "1", "cup"), new Ingredient("Sugar", "1", "TableSpoon"), new Ingredient("Whipped Cream", "1", "scoop"));
    recipeRepository.save(new Recipe("4", "Prasanthi",  "AppleMilkShake", "cool and soothing fruit drink",
            ingredientListApS, 600, 300, stepsApS));

    List<java.lang.String> stepsML = Arrays.asList("Gather the ingredients.", "Blend them all together.",
            "Pour it and serve...Yummy Smoothy Mango Lassi/Yoghurt!");
    List<Ingredient> ingredientListML = Arrays.asList(new Ingredient("Mango Pulp", "1/2", "cup"),
            new Ingredient("Yoghurt", "1", "cup"), new Ingredient("Sugar", "1", "TableSpoon"));
    recipeRepository.save(new Recipe("5", "Prasanthi", "MangoYoghurt", "cool and soothing fruit drink",
            ingredientListML, 600, 300, stepsML));


    List<java.lang.String> stepsASoup = Arrays.asList("Gather all the ingredients.", "In a large sauce pan add butter let it melt.",
            "Add garlic ,onion ,asparagus and saute them for 10 mins on medium heat.", "Add the broth and boil it for 5 mins", "Once the mixture cools down blend it.",
            "Pour the blended mixture back to the sauce pan ,add cream ,salt ,pepper and let it come to boil for 5 mins stirring continuously.",
            "Your soup is done! Enjoy!");
    List<Ingredient> ingredientListASoup = Arrays.asList(new Ingredient("asparagus", "1", "pound trimmed and cut into pieces"),
            new Ingredient("Onions", "1/2", "cup Chopped"), new Ingredient("Vegetable Broth", "14.5", "Ounce"),
            new Ingredient(" Cream", "1/2", "cup"),new Ingredient(" Butter", "2", "Tablespoon"),
            new Ingredient(" Garlic", "3", "Cloves Crushed"),new Ingredient(" salt", "1", "Teaspoon"),
            new Ingredient(" pepper", "1/4", "Teaspoon"));
    recipeRepository.save(new Recipe("6", "Prasanthi", "AsparagusSoup", "Warm healthy Soup",
            ingredientListASoup, 1500, 1000, stepsASoup));


    List<java.lang.String> stepsTSoup = Arrays.asList(
            "Gather all the ingredients.",
            "Add all the ingredients in a large sauce pan with 4 cups of water or vegetable broth and let them cook covered for 15 minutes.",
            "Once the mixture cools down blend it.",
            "Pour the blended mixture back to the sauce pan ,salt ,pepper and let it come to boil for 5 mins stirring continuously.",
            "Your soup is done! Enjoy");
    List<Ingredient> ingredientListTSoup = Arrays.asList(new Ingredient("Tomatoes", "5", "Tomatoes Chopped"),
            new Ingredient("Onions", "2", "Onions Chopped"), new Ingredient("Vegetable Broth", "14.5", "Ounce"),
            new Ingredient(" Ginger", "1/2", "inch Sliced"),new Ingredient(" Black Pepper", "1/2 ", "Teaspoon"),
            new Ingredient(" Garlic", "3", "Cloves Crushed"),new Ingredient(" salt", "1", "teaspoon"));
    recipeRepository.save(new Recipe("7", "Prasanthi", "TomatoSoup", "Warm healthy Soup",
            ingredientListTSoup, 1500, 1000, stepsTSoup));

    List<java.lang.String> stepsMSoup = Arrays.asList(
            "Gather all the ingredients.",
            "Wash the mushrooms to remove any dirt or debris. Slice half of the mushrooms and roughly chop the other half.",
                    "Add the olive oil, mushrooms, garlic, and a pinch of salt and pepper to a soup pot. Sauté the mushrooms. " ,
            "over medium heat until they have released all of their moisture, all the liquid has evaporated from the bottom of the pot.",
                    "and the mushrooms become very dark brown." ,
                    "Add the butter and flour to the pot. Stir and cook for about two minutes more. The flour and butter will form a thick paste. " ,
                            "and coat the mushrooms and the bottom of the pot. It's okay for the flour to coat the pot and brown a bit, just don't let it burn." ,
                    "Finally, add the vegetable broth, water, and dried thyme. Stir to dissolve all of the flour from the bottom of the pot." +
                            " Allow the liquid to come up to a simmer, at which point the flour will slightly thicken the broth.",
            "Stir the cream into the soup. Finally, add the soy sauce, taste the soup, and add an additional pinch of salt if needed . Serve hot!");
    List<Ingredient> ingredientListMSoup = Arrays.asList(new Ingredient("Mushrooms", "1", "lb"),
            new Ingredient("All-Purpose Flour", "1/4", "cup"), new Ingredient("Vegetable Broth", "14.5", "Ounce"),
            new Ingredient(" Cream", "1/2", "cup"),new Ingredient(" Black Pepper", "1/4 ", "Teaspoon"),
            new Ingredient(" Garlic", "3", "Cloves Crushed"),new Ingredient(" salt", "1", "teaspoon"));
    recipeRepository.save(new Recipe("8", "Prasanthi", "MushroomSoup", "CREAMY GARLIC MUSHROOM SOUP",
            ingredientListMSoup, 1500, 1000, stepsMSoup));



    List<java.lang.String> stepsBWMfins = Arrays.asList("Preheat oven for 400 Degrees Fahrenheit.",
      "Gather all the ingredients.","Mash the bananas.","Add all the  ingredients and mix them together.",
      "Pour the batter into muffin trays .","Bake for 18 minutes.","Enjoy your healthy nutty muffins.");
    List<Ingredient> ingredientListBWMfins = Arrays.asList(new Ingredient("Bananas", "5", "Bananas"),
            new Ingredient("Milk", "1/3", "cup"), new Ingredient("Sugar", "1", "cup"),
            new Ingredient("All-Purpose Flour", "2", "cups"), new Ingredient("Cinnanomon", "1/4", "tsp"),
            new Ingredient("Butter", "1/2", "cup"), new Ingredient("Baking Powder", "1", "TableSpoon"),
            new Ingredient("Vanilla Extract", "1/2", "TeaSpoon"));
    recipeRepository.save(new Recipe("9", "Prasanthi",  "BananaWalnutMuffins", "Nutty Healthy Banana Muffins ",
            ingredientListBWMfins, 3000, 1800, stepsBWMfins));


  }
}
