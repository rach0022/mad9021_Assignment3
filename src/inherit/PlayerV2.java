package inherit;

import java.util.ArrayList;

//a subclass is a class like PlayerV2 that extends a super class
//the sub class will inherit all methods, getters, setters and data fields,
//and be able to use all that code without rewriting any of that code while also
//being able to expand on that code towards your specific needs.
public class PlayerV2 extends Player {
    //the extends keyword in java means that this class will inherit code
    //from a "super class" and will become a sub class of that class. essentially
    //we are able to enhance the functionality of the super class by adding whatever code
    //we need to the subclass as defined above

    //player 2 constant values
    protected final short MAX_STRENGTH = 200;
    protected final short MIN_STRENGTH = 0;
    protected final short MAX_WISDOM = 250;
    protected final short MIN_WISDOM = 1;
    protected final short MAX_WEAPONS = 10;
    protected final short MIN_WEAPONS = 1;
    protected final int MAX_CREDITS = 2000000;
    protected final int MIN_CREDITS = -1000000;


    //player2 protected fields
    protected short strength = 0;
    protected short wisdom = 1;
    protected short weapons = 1;
    protected int credits = 0; //no debt for initial value
    protected String faction = "Light";

    protected ArrayList<String> validFactions = new ArrayList<String>();
    //ADD FACTIONS LIGHT AND DARK ARRAY LIST STRING VALID FACTIONS

    //empty constructors
    PlayerV2(){
        super();
        setValidFactions();
    }

    //overloaded constructors
    PlayerV2(String name, String type, boolean avatar, int score, short level, short health, float experience,
             String faction, short strength, short wisdom, short weapons, int credits){
        super(name, type, avatar, score, level, health, experience);
        setValidFactions();
        setFaction(faction);
        setCredits(credits);
        setWisdom(wisdom);
        setWeapons(weapons);
        setStrength(strength);
    }

    //class methods for PlayerV2
    protected void setValidFactions(){
        validFactions.add("Light");
        validFactions.add("Dark");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Faction: \t" + faction);
        System.out.println("Strength: \t" + strength);
        System.out.println("Wisdom: \t" + wisdom);
        System.out.println("Weapons: \t" + weapons);

    }

    //return the title of the player = name + the player type
    public String getTitle(){
        return  this.name + " " + this.type;
    }

    //getters
    public String getFaction() { return faction; }
    public int getCredits() { return credits; }
    public short getStrength() { return strength; }
    public short getWisdom() { return wisdom; }
    public short getWeapons() { return weapons; }

    //setters

    public void setFaction(String faction) {
        for(String s: validFactions){
            if(s.equalsIgnoreCase(faction)){
                this.faction = faction;
                break;
            }
        }
    }

    public void setCredits(int credits) {
        if(credits <= MAX_CREDITS && credits >= MIN_CREDITS){
            this.credits = credits;
        }
    }

    public void setWisdom(short wisdom) {
        if(wisdom <= MAX_WISDOM && wisdom >= MIN_WISDOM){
            this.wisdom = wisdom;
        }
    }

    public void setWeapons(short weapons) {
        if(weapons <= MAX_WEAPONS && weapons >= MIN_WEAPONS){
            this.weapons = weapons;
        }
    }

    public void setStrength(short strength) {
        if(strength <= MAX_STRENGTH && strength >= MIN_STRENGTH){
            this.strength = strength;
        }
    }
}
