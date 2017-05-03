import Cheese.Cheese;
import Clams.Clams;
import Dough.Dough;
import Pepperoni.Pepperoni;
import Sauce.Sauce;
import Veggies.Veggies;

import java.util.Arrays;

/**
 * Created by MUtemov on 03.05.2017.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 min at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
