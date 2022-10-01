package cafe.employee;

import cafe.menu.Menu;
import cafe.menu.Ingredient;

import java.util.Vector;

public abstract class CookingEmployee extends Employee implements CookingService {
    public CookingEmployee(String nickname) { super(nickname); }

    @Override
    public abstract Vector<Ingredient> prepareIngredients(Menu menu);
    @Override
    public abstract Menu make(Menu menu, Vector<Ingredient> ingredients);
    @Override
    public void manageStock() {
        System.out.println("재고 관리 중입니다.");
    }
    @Override
    public void clean() { System.out.println("주방 청소 중입니다."); }
}
