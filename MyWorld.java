import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Arnav Kartikeya
 * @version 1.0
 */
public class MyWorld extends World
{
    final int w = getWidth();
    final int h = getHeight();
    final int NUM_CENTIPEDES = 12;
    final int NUM_MUSHROOMS = 50;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, false); 
        for (int i = 0; i < NUM_CENTIPEDES; i++) 
        {
            Centipede centipede = new Centipede();
            addObject(centipede,  2* i * centipede.getImage().getWidth()/2 + centipede.getImage().getWidth()/2, centipede.getImage().getHeight()/2);
        }
        for (int i = 0; i < NUM_MUSHROOMS; i++) 
        {
            Mushroom mushroom = new Mushroom();
            int x = Greenfoot.getRandomNumber(20) * 20 + mushroom.getImage().getWidth()/2;
            int y = (Greenfoot.getRandomNumber(28) + 1) * 20 + mushroom.getImage().getHeight()/2;
            if (getObjectsAt(x, y, Mushroom.class) != null) 
            {
                x = Greenfoot.getRandomNumber(20) * 20 + mushroom.getImage().getWidth()/2;
                y = (Greenfoot.getRandomNumber(28) + 1) * 20 + mushroom.getImage().getHeight()/2;
            }
            addObject(mushroom, x, y);
        }
    }
}
