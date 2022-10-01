package cafe.menu;

import java.util.Vector;

public class Coffee extends Drink implements Brewable {
    public Coffee() {}

    public Coffee(Vector<Ingredient> ingredients) {
        super(ingredients);
    }

    public Ingredient roast(Ingredient ingredient) { return ingredient; }
    public Ingredient grind(Ingredient ingredient) { return ingredient; }
    public Ingredient boil(Ingredient ingredient) { return ingredient; }

    @Override
    public Drink brew(Vector<Ingredient> ingredients) {
        for(int i = 0; i < ingredients.size(); i++) {
            Ingredient ingredient = ingredients.get(i);
            if(ingredient.getName().equals("water")) {
                ingredients.set(i, boil(ingredient));
            } else if(ingredient.getName().equals("coffee beans")) {
                ingredients.set(i, grind(roast(ingredient)));
            }
        }
        return new Coffee();
    }
}
