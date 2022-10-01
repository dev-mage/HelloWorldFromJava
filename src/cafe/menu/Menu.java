package cafe.menu;

import java.util.Vector;

public class Menu {
    protected Vector<Ingredient> ingredients;

    public Menu() {}
    public Menu(Vector<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Vector<Ingredient> getIngredients() { return ingredients; }
    public void setIngredients(Vector<Ingredient> ingredients) { this.ingredients = ingredients; }
}
