/*
 * Josh Bartlett
 * Purpose: Compute the area of a rectangle
 * June 8, 2019
 * Bellevue University
 * MainRectangle.java
 */

public class MainRectangle {
    public static void main(String[] args){
        
        // Creates a new rectangle using the parameters given
        MyRectangle myRectangle1 = new MyRectangle(10.0, 5.0, "red");
        
        // Prints out the width, height, area, and color of myRectangle1 
        System.out.println("The area of the rectangle with a width of " + 
                myRectangle1.getWidth() + " and height of " + 
                myRectangle1.getHeight() + " is " + myRectangle1.findArea() + 
                " and is " + myRectangle1.getColor() + " in color.");
        
        // Creates a new rectangle using the parameters given
        MyRectangle myRectangle2 = new MyRectangle(25.0, 12.0, "yellow");
        
        // Prints out the width, height, area, and color of myRectangle2
        System.out.println("The area of the rectangle with a width of " + 
                myRectangle2.getWidth() + " and height of " + 
                myRectangle2.getHeight() + " is " + myRectangle2.findArea() + 
                " and is " + myRectangle2.getColor() + " in color.");
    }
}
