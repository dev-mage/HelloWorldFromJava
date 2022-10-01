package cafe.menu;

import java.util.Vector;

public interface Bakeable {
    Ingredient makeDough(Vector<Ingredient> ingredients);
    Dessert bake(Ingredient dough);
}
