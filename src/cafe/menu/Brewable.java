package cafe.menu;

import java.util.Vector;

public interface Brewable {
    Drink brew(Vector<Ingredient> ingredients);
}
