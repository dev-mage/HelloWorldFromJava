package cafe.menu;

import java.util.Vector;

public class Smoothie extends Drink implements Blendable {
    public Smoothie() { super(); }
    public Smoothie(Vector<Ingredient> ingredients) { super(ingredients); }

    @Override
    public Drink blend(Vector<Ingredient> ingredients) {
        return new Smoothie(ingredients);
    }
}
