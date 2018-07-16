package familiarityWithPatterns.pazzle;

public class Queen extends Character {
    KnifeBehavior knifeBehavior = new KnifeBehavior();

    @Override
    void fight() {
        System.out.println("I'm a Queen!");
    }
}
