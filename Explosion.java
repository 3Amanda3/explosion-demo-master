import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * An explosion. It starts by expanding and then collapsing. 
 * The explosion will explode other obejcts that the explosion intersects.
 * 
 * @author Poul Henriksen
 * @version 1.0.1
 */
public class Explosion extends Actor
{
    private final static int IMAGE_COUNT = 12;

    private static GreenfootImage[] images;

    private int imageNum = 0;

    private int increment = 1;

    private int actCycle = 0;
    /**
     * Explosion is the constructer for our explosion object.
     * @param no parameters
     * @return nothing is returned
     */
    public Explosion()
    {
        initializeImages();
        setImage( images[0] );

    }

    /**
     * initilalizeImages sets the image for the explosion by filling the array
     * @param there are no parameters
     * @return noting is returned
     */
    private synchronized static void initializeImages() 
    {
        GreenfootImage baseImage = new GreenfootImage("explosion-big.png");
        int size;

        if( images == null )
        {                        
            images = new GreenfootImage[IMAGE_COUNT];

            for( int i = 0; i < images.length;i++ )
            {
                size = (i+1) * ( baseImage.getWidth() / IMAGE_COUNT);
                images[i] = new GreenfootImage( baseImage);
                images[i].scale( size,size);
            }
        }
    }

    /**
     * act will cause the explosion to increase in size untill it hits the max size then it will decrease in size
     * untill it reaches its min. once that happens it will dissappear.
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        if(actCycle == 0)
        {
            Greenfoot.playSound("MetalExplosion.wav");   
        }

        actCycle++;

        setImage(images[imageNum] );

        imageNum += increment;

        if(imageNum >= IMAGE_COUNT )
        {
            increment = -increment;
            imageNum += increment;
        }

        if( imageNum < 0)
        {
            getWorld().removeObject(this);
        }
    }

}