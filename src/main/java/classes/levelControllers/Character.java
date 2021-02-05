package classes.levelControllers;

import Enums.Classes;
import Enums.Races;
import interfaces.CharacterInterface;

public class Character implements CharacterInterface {
    private final String name;
    private Level level = new Level(0);
    private final Race race;
    private final CharacterClass characterClass;

    public Character(String name, Race race, CharacterClass characterClass) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Race getRace() {
        return race;
    }

    @Override
    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    @Override
    public void addExperience(int exp) {
        level.setExperience(exp);
    }

    @Override
    public int getExperience() {
        return level.getExperience();
    }

    @Override
    public String getRaceAsString() {
        return race.getRaceAsString();
    }

    @Override
    public String getClassAsString() {
        return characterClass.getClassAsString();
    }

    @Override
    public boolean checkLevelUpdate() {
        return level.checkLevelUp();
    }

    @Override
    public int getLevel() {
        return level.getLevel();
    }
}
