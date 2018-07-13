package familiarityWithPatterns.delegation;

import familiarityWithPatterns.simpleRealization.FlyWithWings;
import familiarityWithPatterns.simpleRealization.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("I'm Mallard Duck!");
    }

}
