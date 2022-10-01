package cafe.menu;

import java.util.Vector;

public interface Meltable {
    Vector<Ingredient> melt(Vector<Ingredient> ingredients);
    Ingredient mix(Vector<Ingredient> ingredients);
    Dessert coolDown(Ingredient ingredient);
}
