import Cheese.ReggianoCheese;
import Clams.FreshClams;
import Dough.ThinCrustDough;
import Sauce.MarinaraSauce;

/**
 * Created by MUtemov on 03.05.2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    ThinCrustDough thinCrustDough;
    MarinaraSauce marinaraSauce;
    ReggianoCheese reggianoCheese;
    FreshClams freshClams;
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
