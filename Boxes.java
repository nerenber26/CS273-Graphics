/** This program draws concentric Boxes
 *   @author 
 */

// Import a couple of library-packages
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/** class Boxes
 *
 * The important thing that we need to do in this class is finish the
 * 'paint' method.  
 */
public class Boxes extends Canvas implements KeyListener
{
    int clickCount = 0;
    /** the "paint" method, that specifies what to draw on the screen
     * 
     * This method needs to be updated
     */
    public void paint(Graphics g)
    {
        //This line is important, don't remove it!
        super.paint(g);
        
        //Don't touch these ones either
        Font originalFont = g.getFont();
        Font newFont = originalFont.deriveFont(originalFont.getSize2D() * 1.4f);
        g.setFont(newFont);
        g.drawString("Press space to draw all rectangles...", 0, 18);
        
        //The statements below draw some boxes, but they aren't the boxes you want.
        //Replace them with the correct code.
        
        //Don't edit the if statements themselves, just edit the lines inside
        //of them that actually make the rectangles
        
        //When you are running the program, press the spacebar to draw 
        //the next rectangles
        if (clickCount >= 0) {
            g.setColor(Color.red);
            g.fillRect(100,100,100,100);
        } 
        if (clickCount >= 1) {
            g.setColor(Color.green);
            g.fillRect(200,200,100,100);
        }
        if (clickCount >= 2) {
            g.setColor(Color.green);
            g.fillRect(300,300,100,100);
        }
        
      
        
    }//paint

     @Override
    public void keyTyped(KeyEvent e) {
        // Ignore key typed events
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            clickCount++;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Ignore key released events
    }
    /**
     * main
     *
     * All Java programs start with a method named main.  This class' main
     * method creates the window to display your Java drawing.
     *
     * IMPORTANT:  DO NOT MODIFY THIS METHOD
     */
    public static void main(String[] args)
    {
        //Create a window for this program
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600,600);
 
        //Put an instance of this class in the window frame
        Boxes myContent = new Boxes();
        myContent.setBackground(Color.gray.brighter()); // set background color
        myFrame.getContentPane().add(myContent);
        
        // display the frame
        myFrame.setVisible(true);
        
        myContent.addKeyListener(myContent);
        myContent.setFocusable(true); // Ensure the canvas receives focus
    }//main


    
}//class Boxes