import Enums.Classes;
import Enums.Races;
import classes.levelControllers.Character;
import classes.levelControllers.CharacterClass;
import classes.levelControllers.Race;

public class App {
    public static void main(String[] args) {
        Race testRace = new Race();
        testRace.setRace(Races.DWARF);
        CharacterClass testClass = new CharacterClass();
        testClass.setCharacterClass(Classes.FIGHTER);

        Character character = new Character("Test", testRace, testClass);

        System.out.println(character.getName());
        System.out.println(character.getClassAsString());
        System.out.println(character.getRaceAsString());

        for (int e = 0 ; character.getLevel() < 10; e++) {
            character.addExperience(10);
            System.out.print("_");

            if (character.checkLevelUpdate()) {
                System.out.println();
                System.out.println("Level up to " + character.getLevel());
            }
        }
    }
}
