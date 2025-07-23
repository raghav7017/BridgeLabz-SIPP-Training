package Generics;

import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getName();
    int getCalories();
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    private String name;
    private int calories;

    public VegetarianMeal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void showMeal() {
        System.out.println("Vegetarian Meal: " + name + ", Calories: " + calories);
    }
}

class VeganMeal implements MealPlan {
    private String name;
    private int calories;

    public VeganMeal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void showMeal() {
        System.out.println("Vegan Meal: " + name + ", Calories: " + calories);
    }
}

class KetoMeal implements MealPlan {
    private String name;
    private int calories;

    public KetoMeal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void showMeal() {
        System.out.println("Keto Meal: " + name + ", Calories: " + calories);
    }
}

class HighProteinMeal implements MealPlan {
    private String name;
    private int calories;

    public HighProteinMeal(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void showMeal() {
        System.out.println("High-Protein Meal: " + name + ", Calories: " + calories);
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public T getMealType() {
        return mealType;
    }

    public void displayMealPlan() {
        mealType.showMeal();
    }
}

class MealPlanUtils {
    public static <T extends MealPlan> void generatePersonalizedMealPlan(T meal) {
        if (meal.getCalories() > 0 && meal.getCalories() < 1000) {
            System.out.println("Generating personalized meal plan...");
            meal.showMeal();
        } else {
            System.out.println("Invalid meal plan: " + meal.getName() + " has unrealistic calories.");
        }
    }
}

public class PersonalizedMealPlanSystem {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Paneer Curry", 500));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Tofu Stir Fry", 450));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Keto Chicken Bowl", 650));
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal("Grilled Chicken & Eggs", 700));

        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.add(vegMeal.getMealType());
        allMeals.add(veganMeal.getMealType());
        allMeals.add(ketoMeal.getMealType());
        allMeals.add(proteinMeal.getMealType());

        System.out.println("--- Personalized Meal Plans ---");
        for (MealPlan m : allMeals) {
            MealPlanUtils.generatePersonalizedMealPlan(m);
        }
    }
}

