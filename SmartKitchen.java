public class SmartKitchen {

    private Refrigerator refrigerator;
    private DishWasher dishwasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishwasher, CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
        this.dishwasher = dishwasher;
        this.refrigerator = refrigerator;
    }

    public void addWater(){
        refrigerator.setHasWorkToDo(true);
    }

    public void pourMilk(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishwasher.setHasWorkToDo(true);
    }

//    public Refrigerator getRefrigerator() {
//        return refrigerator;
//    }
//
//    public DishWasher getDishwasher() {
//        return dishwasher;
//    }
//
//    public CoffeeMaker getCoffeeMaker() {
//        return coffeeMaker;
//    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishWasher();
        coffeeMaker.brewCoffee();
        dishwasher.doDishes();
        refrigerator.orderFood();
    }
}
