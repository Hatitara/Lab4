class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0);
            System.out.println(this + " killed " + c);
        } else {
            c.power = Math.max(c.power - 1, 0);
            System.out.println(this + " decreases " + c + "'s power by 1");
        }
    }
}
