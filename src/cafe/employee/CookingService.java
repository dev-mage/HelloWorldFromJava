package cafe.employee;

import cafe.menu.Menu;
import cafe.menu.Ingredient;

import java.util.Vector;

public interface CookingService {
    Vector<Ingredient> prepareIngredients(Menu menu);
    Menu make(Menu menu, Vector<Ingredient> ingredients);
    void manageStock();

}
