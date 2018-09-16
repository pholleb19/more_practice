import java.lang.reflect.Field;

public class food { // class name
    private boolean sweet, salty, bitter, savory, sour;
    private int calories;
    private String name;

    // constructor
    public food(boolean sweet, boolean salty, boolean bitter, boolean savory, boolean sour, int calories, String name){
        this.sweet = sweet;
        this.salty = salty;
        this.bitter = bitter;
        this.savory = savory;
        this.sour = sour;
        this.calories = calories;
        this.name = name;
    }

    // makes it sweet
    public void addSugar(){
        sweet = true;
    }

    // makes it salty
    public void addSalt(){ // makes it salty
        salty = true;
    }

    // describes the food using the fields
    public void describeMe(){
        System.out.print(name + " has " + calories + " calories. ");
        for (Field f : this.getClass().getFields()){ // really roundabout way of making sure I'm able to access the name of the variables because idk how else
            if (f.equals(true)) System.out.print(name + " is " + f.getName() + ". ");
        }
    }

}
