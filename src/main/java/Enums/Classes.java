package Enums;

public enum Classes {
    //warriors
    FIGHTER("fighter"),
    RANGER("ranger"),
    BARBARIAN("barbarian"),
    MONK("monk"),

    //mages
    MAG("mag"),
    WARLOCK("warlock"),
    SORCERER("sorcerer"),
    WIZARD("wizard"),

    //priests
    CLERIC("cleric"),
    DRUID("druid"),

    //rogues
    THIEF("thief"),
    ROGUE("rouge"),
    BOWER("bower"),
    HUNTER("hunter");

    String label;

    private Classes(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
