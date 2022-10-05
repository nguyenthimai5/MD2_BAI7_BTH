package BTH1;

import BTH1.animals.Animal;
import BTH1.animals.Chicken;
import BTH1.animals.Tiger;
import BTH1.edible.IEdible;
import BTH1.fruit.Apple;
import BTH1.fruit.Fruit;
import BTH1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
        if (animal instanceof  Chicken){
            IEdible edible=(Chicken) animal;
            System.out.println(edible.howToEat());
        }
            Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
        }
    }
}