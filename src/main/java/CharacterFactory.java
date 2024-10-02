import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private static final List<Class<? extends Character>> characterTypes = List.of(Hobbit.class, Elf.class, King.class, Knight.class);

    public static Character createCharacter() {
        Random random = new Random();
        int choice = random.nextInt(characterTypes.size());
        try {
            Constructor<? extends Character> constructor = characterTypes.get(choice).getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
