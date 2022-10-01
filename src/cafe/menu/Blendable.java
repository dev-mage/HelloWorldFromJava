package cafe.menu;

import java.util.Vector;

public interface Blendable {
    Drink blend(Vector<Ingredient> ingredients);
}
