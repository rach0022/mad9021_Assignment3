package inherit;


import java.util.ArrayList;

//a super class, like the Player class below is the base class when building a java object
//the base class can define all the data fields functions, getters and setters needed for
//any super class that extends from it. Say we were creating a dog program, and we already have a class
//for the base dog. now if we want to create a dachshund class, we can extend the super class
//to inherit from the dog class (so we have all the data, for legs, fur, etc) and just add all the
//hot dog like attributes we want to the sub class (the dachshund class)
public class Player {

    //these are not data members
    //they are fields, which are data members
    protected final String HAS_AVATAR = "Yes"; //final is basically a constant
    protected final String NO_AVATAR = "No";
    protected final int MAX_SCORE = 5000000;
    protected final int MIN_SCORE = 0;
    protected final short MAX_LEVEL = 20;
    protected final short MIN_LEVEL = 0;
    protected final short MAX_HEALTH = 100;
    protected final short MIN_HEALTH = 0;
    protected final float MAX_EXPERIENCE = 100.0f;
    protected final float MIN_EXPERIENCE = 0.0f;


    protected String name = "";
    protected String type = "Warrior";
    protected boolean avatar = false;

    protected int score = 0;
    protected short level = 1;
    protected short health = 100;
    protected float experience = 0.0f;

    protected ArrayList<String> validPlayerTypes = new ArrayList<String>();

    protected void setValidPlayerTypes(){
        validPlayerTypes.add("Warrior"); //we would use push_back in c++ instead of add
        validPlayerTypes.add("Healer");
        validPlayerTypes.add("Wizard");
        validPlayerTypes.add("Rouge");
        validPlayerTypes.add("Viking");
        validPlayerTypes.add("Rebel");
        validPlayerTypes.add("Mercenary");
        validPlayerTypes.add("Royal");
    }

    public Player() {    // default constructor, constructors start with uppercase
        setValidPlayerTypes();
    }

    public Player(String name,
                  String type,
                  boolean avatar,
                  int score,
                  short level,
                  short health,
                  float experience) { //overloaded constructor

        //using the set methods so all the data is validated
        setValidPlayerTypes();
        setName(name);
        setType(type);
        setAvatar(avatar);
        setScore(score);
        setLevel(level);
        setHealth(health);
        setExperience(experience);
    }

    // Output Method
    public void output() {
        System.out.println( "\n" + "Name:\t\t" + name);
        System.out.println("Type:\t\t" + type);
        System.out.println("Avatar:\t\t" + (avatar ? HAS_AVATAR : NO_AVATAR));
        System.out.println("Score:\t\t" + score);
        System.out.println("Level:\t\t" + level);
        System.out.println("Health:\t\t" + health);
        System.out.println("Experience:\t" + experience);
    }

    //setters
    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
    }

    public void setType(String type) {
        for (String s : validPlayerTypes){
            if(s.equalsIgnoreCase(type)){
                this.type = s;
                break;
            }
        }
    }

    public void setAvatar(boolean avatar) {
        this.avatar = avatar;
    }

    public void setExperience(float experience) {
        if(experience <= MAX_EXPERIENCE && experience >= MIN_EXPERIENCE) {
            this.experience = experience;
        }
    }

    public void setHealth(short health) {
        if(health <= MAX_HEALTH && health >= MIN_HEALTH){
            this.health = health;
        }
    }

    public void setLevel(short level) {
        if(level <= MAX_LEVEL && level >= MIN_LEVEL){
            this.level = level;
        }
    }

    public void setScore(int score) {
        if(score <= MAX_SCORE && score >= MIN_SCORE){
            this.score = score;
        }
    }

    //getters
    public String getName() { return this.name; }
    public String getType() { return type; }
    public float getExperience() { return experience; }
    public int getScore() { return score; }
    public short getHealth() { return health; }
    public short getLevel() { return level; }
    public boolean getAvatar() { return avatar; }

}
