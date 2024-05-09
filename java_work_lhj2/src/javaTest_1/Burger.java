package javaTest_1;



import java.util.ArrayList;

public class Burger {
    private String name;
    private int price;
    private ArrayList<Ingredient> ingredients;

    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        this.price += ingredient.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
}
