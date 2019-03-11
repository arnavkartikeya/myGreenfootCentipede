import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Centipede here.
 * 
 * @author Mehul Tailang 
 * @version 1.0
 */
public class Centipede extends Actor
{
    public Centipede() 
    {
        getImage().scale(20, 20);
    }
    /**
     * Act - do whatever the Centipede wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dx = 20;
    GreenfootImage img = getImage();
    int width = img.getWidth()/2;

    public void act() 
    {
       setLocation(getX() + dx, getY());
       if (getWorld().getWidth() < getX() + width) 
        {
            turn(90);
            move();
            turn(90);
            dx = -dx;
        }
        else if (getX() - width < 0) 
        {
            turn(-90);
            move();
            turn(-90);
            dx = -dx;
        }
        
                               
    } 

    public void move() 
    {
        move(20);
    }
    
}
    
 