/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square floor;
    private Square garage;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        floor = new Square();
        garage = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-240);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
          
            garage.moveHorizontal(-120);
            garage.moveVertical(40);
            garage.changeSize(100);
            garage.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-220);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            floor.changeColor("green");
            floor.moveHorizontal(-310);
            floor.moveVertical(140);
            floor.changeSize(500);
            floor.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(-80);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(140);
            sun.moveVertical(-10);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
            
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        floor.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
