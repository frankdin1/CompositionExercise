//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        SmartKitchen smartKitchen = new SmartKitchen(fridge, dishWasher, coffeeMaker);

//        smartKitchen.addWater();
//        smartKitchen.pourMilk();
//        smartKitchen.loadDishWasher();
//        smartKitchen.getCoffeeMaker().brewCoffee();
//        smartKitchen.getDishwasher().doDishes();
//        smartKitchen.getRefrigerator().orderFood();

        smartKitchen.doKitchenWork();
    }
}