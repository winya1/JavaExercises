/* Part 1: Adding a Meal
Implement the public void addMeal(String meal) method, which adds a new meal to the meals list. If the meal you want to add is already on the list, you shouldn't add it again. The list method contains is handy for checking an items existence on it.

Part 2: Printing the Meals
Implement the public void printMeals() method, which prints the meals. You can test out the program using the following example code.

Part 3: Clearing the Food List
Clearing the Food List
Implement the public void clearMenu() method, which clears the menu. The ArrayList class has a method which is useful here. NetBeans can hint at the available methods when you type the object name an a dot. Try to write meals. inside the method frame and see what happens. */
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }


    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
        }
    }
