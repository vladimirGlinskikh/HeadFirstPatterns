package familiarityWithPatterns.delegation;

import familiarityWithPatterns.simpleRealization.FlyNoWay;
import familiarityWithPatterns.simpleRealization.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
