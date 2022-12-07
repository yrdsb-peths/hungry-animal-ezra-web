import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * this is the title screen
 * 
 * @author Ezra
 * @version December 6
 */
public class TitleScreen extends World
{
    Label title = new Label("Hungry Elephant", 75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (title, getWidth()/2, getHeight()/2);
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
}
