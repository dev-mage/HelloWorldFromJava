package cafe.employee;

import cafe.menu.Menu;
import cafe.menu.Ingredient;

import java.util.Vector;

public class Patissier extends CookingEmployee {
    public Patissier(String nickname) {
        super(nickname);
    }

    @Override
    public Vector<Ingredient> prepareIngredients(Menu menu) {
        return null;
    }
    @Override
    public Menu make(Menu menu, Vector<Ingredient> ingredients) {
        return null;
    }
}
