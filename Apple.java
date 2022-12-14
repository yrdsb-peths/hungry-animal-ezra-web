import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Apple for Elephant
 * 
 * @author Ezra
 * @version Dec 2
 */
public class Apple extends Actor
{
    private int speed = 1;
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation (getX(), getY() + 1);
        
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        //remove the apple if missed
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }   
    }    
    
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
