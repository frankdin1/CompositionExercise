public class SmartAppliance {
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

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


    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void orderFood(){
        if (getHasWorkToDo()) {
            System.out.println("Your food has been ordered.");
        }
    }
}

class DishWasher extends SmartAppliance{

    private boolean hasWorkToDo;

    @Override
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes(){
        if (getHasWorkToDo())
            System.out.println("The dishes have been done.");
    }
}

class CoffeeMaker extends SmartAppliance{

    private boolean hasWorkToDo;

    @Override
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void brewCoffee(){
        System.out.println("Your coffee is ready.");
    }
}
