package BTH1.animals;

import BTH1.animals.Animal;
import BTH1.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    public String makeSound(){
        return "Chicken: cluck_cluck";
    }
    public String howToEat(){
        return "could be fried";
    }
}
