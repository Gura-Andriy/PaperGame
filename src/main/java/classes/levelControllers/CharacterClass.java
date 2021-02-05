package classes.levelControllers;

import Enums.Classes;
import interfaces.CharacterClassInterface;

public class CharacterClass implements CharacterClassInterface {
    private Classes characterClass;
    @Override
    public void setCharacterClass(Classes characterClass) {
        this.characterClass = characterClass;
    }

    @Override
    public Classes getCharacterClass() {
        return characterClass;
    }

    @Override
    public String getClassAsString() {
        return characterClass.getLabel();
    }

}
