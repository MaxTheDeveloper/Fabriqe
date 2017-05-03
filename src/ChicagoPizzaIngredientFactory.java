import Cheese.MozarellaCheese;
import Clams.FrozenClams;
import Dough.ThickCrustDough;
import Sauce.PlumTomatoSauce;

/**
 * Created by MUtemov on 03.05.2017.
 */
public class ChicagoPizzaIngredientFactory implements  PizzaIngredientFactory {
    ThickCrustDough thickCrustDough;
    PlumTomatoSauce plumTomatoSauce;
    MozarellaCheese mozarellaCheese;
    FrozenClams frozenClams;
    @Override
    public void createDough() {

    }

    @Override
    public void createSauce() {

    }

    @Override
    public void createCheese() {

    }

    @Override
    public void createVeggies() {

    }

    @Override
    public void createPepperoni() {

    }

    @Override
    public void createClam() {

    }
}
