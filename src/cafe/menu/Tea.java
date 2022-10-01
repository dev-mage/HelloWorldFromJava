package cafe.menu;

import java.util.Vector;

public class Tea extends Drink implements Brewable {
    public Tea() {}
    public Tea(Vector<Ingredient> ingredients) { super(ingredients); }

    @Override
    public Drink brew(Vector<Ingredient> ingredients) { return new Tea(ingredients); }
}
