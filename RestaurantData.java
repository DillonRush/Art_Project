public class RestaurantData {

// Instance variables 
    private String name;
    private String size;

// Parameterized constructor
    public RestaurantData(String name, String size) {
      this.name = name; 
      this.size = size; 
    }
  
/*
 * Accessor methods 
 */
    public String getName() {
      return name; 
    }
  

    public String getSize() {
      return size; 
    }


/*
 * What prints in the console 
 */
    public String toString() {
      return "Size: " + size + " |" + " Name: " + name; 
  }
}