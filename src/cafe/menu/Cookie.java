package cafe.menu;

import java.util.Vector;

public class Cookie extends Dessert implements Bakeable {
    public Cookie() {}
    public Cookie(Vector<Ingredient> ingredients) { super(ingredients); }

    @Override
    public Ingredient makeDough(Vector<Ingredient> ingredients) {
        return new Ingredient("dough");
    }

    @Override
    public Dessert bake(Ingredient dough) { return new Cookie(); }
}
