package familiarityWithPatterns.pazzle;

public class Knight extends Character{
    AxeBehavior axeBehavior = new AxeBehavior();
    SwordBehavior swordBehavior = new SwordBehavior();
    KnifeBehavior knifeBehavior = new KnifeBehavior();

    @Override
    void fight() {
        System.out.println("I'm a Khight!");
    }
}
