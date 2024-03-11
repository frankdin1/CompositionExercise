public class SmartAppliance {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class Refrigerator extends SmartAppliance{

    private boolean hasWorkToDo;

    @Override
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void orderFood(){
        if (hasWorkToDo)
            System.out.println("Your food has been ordered.");
    }
}

class DishWasher extends SmartAppliance{

    private boolean hasWorkToDo;

    @Override
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    public void doDishes(){
        if (hasWorkToDo)
            System.out.println("The dishes have been done.");
    }
}

class CoffeeMaker extends SmartAppliance{

    private boolean hasWorkToDo;

    @Override
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo)
            System.out.println("Your coffee is ready.");
    }
}
