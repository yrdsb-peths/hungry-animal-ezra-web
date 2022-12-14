import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * this is the title screen 
 * shows tutorial, which keys to move
 * 
 * 
 * @author Ezra
 * @version December 6
 */
public class TitleScreen extends World
{
    Label title = new Label("Hungry Elephant", 75);
    Label instructions = new Label ("Use <-- and --> to Move", 40);
    Label start = new Label ("press <space> to Start", 50);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (title, getWidth()/2, 170);
        addObject (instructions, getWidth()/2, 300);
        addObject (start, getWidth()/2, 50);
        prepare();
    }
    
    /**
     * SpaceBar to start game / Switch worlds
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    public void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant, 50,360);
    }
}
