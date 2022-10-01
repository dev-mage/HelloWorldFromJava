package cafe.menu;

import java.util.Vector;

public class Bread extends Dessert implements Bakeable {
    @Override
    public Ingredient makeDough(Vector<Ingredient> ingredients) {
        return null;
    }

    @Override
    public Dessert bake(Ingredient dough) {
        return null;
    }

    public Bread() {
        super();
    }

    public Bread(Vector<Ingredient> ingredients) {
        super(ingredients);
    }
}
