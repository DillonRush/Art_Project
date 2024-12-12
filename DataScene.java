import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

    private String[] name;            // 1D array of RestaurantData's objects
    private String[] size;         

  /** Constructor */
  public DataScene() {
    name = FileReader.toStringArray("name.txt");
    size = FileReader.toStringArray("size.txt");
  }

 

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {
 for(int i = 0; i < name.length; i++){
   clear("white");
   
   setTextColor("black");
    drawText("Our Order History!", 40, 40);
   
   setTextColor("blue");   
    drawText("pizza: ", 40, 70);
   setTextColor("black");
   drawText(name[i], 100, 70); 
   
   setTextColor("Red");   
    drawText("Size: ", 40, 100);
   setTextColor("black");
    drawText(size[i], 100, 100);
   
   pause(0.5);
  }
  }
  /** Other Methods */
  
}