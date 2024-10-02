public abstract class Noble extends Character {
    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(randomInRange(minPower, maxPower), randomInRange(minHp, maxHp));
    }

    @Override
    public void kick(Character c) {
        int damage = randomInRange(1, this.power);
        c.setHp(c.hp - damage);
        System.out.println(this + " kicks " + c + " for " + damage + " damage");
    }

    public static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
