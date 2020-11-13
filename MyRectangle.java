/*
 * Josh Bartlett
 * Purpose: Compute the area of a rectangle
 * June 8, 2019
 * Bellevue University
 * MyRectangle.java
 */

public class MyRectangle {
    
    // Creates the variables for the parameters of the rectangle
    private double width;
    private double height;
    private static String color;   
    
    // Constructor method for default paramaters 
    public MyRectangle(){
        width = 1.0;
        height = 1.0;
        color = "white";
    }
    
    // Used to create new rectangles when called from the main class
    public MyRectangle(double widthParam, double heightParam, String colorParam){
        width = widthParam;
        height = heightParam;
        color = colorParam;
    }
    
    // Accessor methods to get and set the width parameter
    public double getWidth(){
        return width;
    }
    public void setWidth(double widthParam){
        width = widthParam;
    }
    
    // Accessor methods to get and set the height parameter
    public double getHeight(){
        return height;
    }
    public void setHeight(double heightParam){
        height = heightParam;
    }
    
    // Accessor methods to get and set the color parameter
    public String getColor(){
        return color;
    }
    public static void setColor(String colorParam){
        color = colorParam;
    }
    
    // Method for finding the area of the rectangle
    public double findArea(){
        return (width * height);
    }
}
