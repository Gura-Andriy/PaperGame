package interfaces;

import Enums.Classes;
import Enums.Races;
import classes.levelControllers.CharacterClass;
import classes.levelControllers.Race;

public interface CharacterInterface {
    String getName();
    Race getRace();
    CharacterClass getCharacterClass();
    void addExperience(int exp);
    int getExperience();
    boolean checkLevelUpdate();
    int getLevel();

    String  getClassAsString();
    String getRaceAsString();
}
