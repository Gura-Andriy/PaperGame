package classes.levelControllers;

import Enums.Races;
import interfaces.RaceInterface;

public class Race implements RaceInterface {
    private Races race;

    @Override
    public void setRace(Races race) {
        this.race = race;
    }

    @Override
    public Races getRace() {
        return race;
    }

    @Override
    public String getRaceAsString() {
        return race.getLabel();
    }
}
