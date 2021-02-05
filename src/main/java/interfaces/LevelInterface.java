package interfaces;

public interface LevelInterface {
    void setLevel(int lvl);
    int getLevel();
    void setExperience(int exp);
    int getExperience();
    boolean checkLevelUp();
    int setExperienceToNextLevel();
}
