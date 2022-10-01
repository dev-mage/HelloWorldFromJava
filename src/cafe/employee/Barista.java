package cafe.employee;

import cafe.menu.*;

import java.util.Vector;

public class Barista extends CookingEmployee {

    public Barista(String nickname) {
        super(nickname);
        System.out.println("바리스타 " + nickname + " 출근");
    }

    @Override
    public Vector<Ingredient> prepareIngredients(Menu menu) {
        System.out.println("음료를 준비중입니다.");
        Vector<Ingredient> ingredients = new Vector<>();
        if(menu instanceof Coffee) {
            ingredients.add(new Ingredient("water"));
            ingredients.add(new Ingredient("coffee beans"));
        } else if (menu instanceof Tea) {
            ingredients.add(new Ingredient("water"));
            ingredients.add(new Ingredient("tea leaves"));
        } else if (menu instanceof Smoothie) {
            ingredients.add(new Ingredient("fruit"));
            ingredients.add(new Ingredient("ice"));
            ingredients.add(new Ingredient("syrup"));
        }
        return ingredients;
    }

    @Override
    public Menu make(Menu menu, Vector<Ingredient> ingredients) {
        Drink drink = new Drink();
        if(menu instanceof Brewable) {
            drink = ((Brewable) menu).brew(ingredients);
        } else if (menu instanceof Blendable) {
            drink = ((Blendable) menu).blend(ingredients);
        }
        System.out.println("음료 준비되었습니다.");
        return drink;
    }
}
