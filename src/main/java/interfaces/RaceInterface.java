package interfaces;

import Enums.Races;
import classes.levelControllers.Race;

public interface RaceInterface {
    void setRace(Races race);
    Races getRace();
    String getRaceAsString();

}
