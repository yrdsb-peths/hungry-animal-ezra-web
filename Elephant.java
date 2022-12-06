import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    //face the right way, direction
    String facing = "right";
    /**
     * constructor- runs once when elephant is created
     */
    
    
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(75, 75);
        }
        
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(75, 75);
        }
        //Initial elephant image
        setImage(idleRight[0]);
    }
    
    /**
     * this animates the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(facing.equals("right"))
        {
            
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        eat();
        
        //to animate the elephant
        animateElephant();
        
    }    
    
    
    /**
     * Eats teh apple and spawn new one
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    
    
    }
}
