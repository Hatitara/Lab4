package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Fight starts between " + c1 + " and " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }
        System.out.println("Fight ends. Winner: " + (c1.isAlive() ? c1 : c2));
    }
}
