package pazzle;

public class Main {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.fight();
        queen.knifeBehavior.useWeapon();

        Knight knight = new Knight();
        knight.fight();
        knight.knifeBehavior.useWeapon();
        knight.axeBehavior.useWeapon();
        knight.swordBehavior.useWeapon();
    }
}
