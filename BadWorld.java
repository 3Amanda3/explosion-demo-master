import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadWorld here.
 * Amanda Schepp
 * Mr.Hardman
 * Assignment #2
 * March 20th
 */
public class BadWorld extends World
{

    /**
     * Constructor for objects of class BadWorld.
     * 
     */
    public BadWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rock rock = new Rock();
        addObject(rock,276,201);
    }
}
