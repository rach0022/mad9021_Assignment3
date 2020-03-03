/*************************
 *
 *  @description The PlayerV2 subclass of the Player class
 *
 *  @author Ravi Chandra Rachamalla rach0022@algonquinlive.com
 *
 *  @version Mar 3, 2020
 *
 ***********************/

//the package keyword in java allows us to denote that this class file is part of a bundle
//of other java class files. This allows us to access the different methods or functions from
//the other class files under specific namespaces allowing for us to either extend upon code or build
//functionality for different objects to interact with each other. giving you the power to create large
//complex programs with a clean and concise java class files allowing for more readable and robust code
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
    //the final keyword in java is used to denote that we need to create a new
    //instance of an object or data type but that the same time we need this value to never change
    //and be consistent throughout runtime, making it immutable. for example
    // if we need to know the value of gravity of a specific area planet for the most part that stays the same
    // so we could use the final keyword to say that final int GRAVITY = 1.00 so it doesnt get altered during runtime.
    // the final keyword is similar to the const keyword in c++.
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
    protected short weapons = 2; //start of with 2 weapons | 2 fists
    protected int credits = 0; //no debt for newbies
    protected String faction = "The Forgotten"; //self explanatory


    //the java arraylist keyword allows us to create an arraylist class
    //compared to the normal array class, we have most of the same array functionality
    //with the added functionality of a dynamic list interface. For example we can add and remove elements
    //after the array is made and it will dynamically size to fit them. It is similar to the vector interface
    //from c++
    protected ArrayList<String> validFactions = new ArrayList<String>();
    //ADD FACTIONS LIGHT AND DARK ARRAY LIST STRING VALID FACTIONS

    //empty constructors
    PlayerV2(){
        //the super keyword in java allows us to refer to the super class of the class object we
        //are working inside. in this example I am calling the constructor of the super class inside
        //my default constructor for the PlayerV2 class because I can run all the code that instantiates
        //the Player class and then add upon it whatever other code i need to run to make a new instance of a
        //PlayerV2 object
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
        validFactions.add("Demons");
        validFactions.add("Gods");
        validFactions.add("Ancient Ones");
        validFactions.add("Architects");
        validFactions.add("Subterraneans");
        validFactions.add("The Forgotten");
        validFactions.add("Overlords");
        validFactions.add("Sun Folk");
        validFactions.add("Lunar Monks");
    }

    //overriding in java or any oop language allows a subclass to
    //tweak or enhance a specific method that is provided by the super class
    //allowing for a more precise implementation of that method based on your needs
    //for example we have the output method already provided below from the super class
    //but it does not have our new data fields so I can override the method allowing
    //for the normal implementation to occur by calling the super.output() version of the method
    //and then add the extra system out calls for all my new data fields created in the sub class
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
    //this is java allows us to refer to the specific instance of an object.
    //to actually use any of the code from our java class we wil create an instance of it
    //in some other class or main function using the new CLASSNAME  keyword. inside the class file
    //if we ever want to refer to properties of one specific instance of an object we can use the this keyword
    //to access its data fields or methods which allows us to keep our code more organized as well as say
    //we ever create a function where a player battles another player. both player objects have the same
    //data field names so writing say if( strength > strength) would get confusing as to whats its referring to
    //so instead we can access the specific namespace of this object instance by instead saying this.strength > strength

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
