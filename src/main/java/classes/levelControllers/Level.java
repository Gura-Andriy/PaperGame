package classes.levelControllers;

import interfaces.LevelInterface;

public class Level implements LevelInterface {
    private int level;
    private int experience;
    private int experienceToNextLevel = 100;
    private int lastLevel;

    public Level(int firstLevel) {
        level = firstLevel;
    }

    @Override
    public void setLevel(int lvl) {
        level = lvl;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setExperience(int exp) {
        if (exp >= experienceToNextLevel - experience) {
            experience = experienceToNextLevel - experience;
            level++;
            experienceToNextLevel *= 1.15;
        } else {
            experience += exp;
        }
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public boolean checkLevelUp() {
        if (level > lastLevel) {
            lastLevel++;
            return true;
        } else return false;
    }

    @Override
    public int setExperienceToNextLevel() {
        return (int)(experienceToNextLevel * 1.1);
    }
}
