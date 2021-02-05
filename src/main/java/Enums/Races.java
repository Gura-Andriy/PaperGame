package Enums;

import classes.levelControllers.Race;

public enum Races {
    HUMAN("human"),
    ELF("elf"),
    ORK("ork"),
    DWARF("dwarf"),
    ENT("ent"),
    FAIRY("fairy"),
    FURY("fury"),
    OGR("ogr");


    String label;

    private Races(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
