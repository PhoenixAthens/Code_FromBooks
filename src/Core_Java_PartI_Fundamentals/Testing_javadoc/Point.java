package Core_Java_PartI_Fundamentals.Testing_javadoc;
//class to test the use of javadoc command
/** Represents the class of two-dimensional geometrical points.*/
public class Point {
    /**
     * @task Re-visit the documentation
     * */
    private int x, y;
    /** Returns x coordinate of the point */
    public int getX(){
        /**This comment will not be processed (because it lies inside a method)*/
        return x;}

    /** Returns y coordinate of the point
     * @task modify the method to something better
     * @return the Y coordinate of the point
     * */
    public int getY(){return y;}

    /**
     *
     * @param newX the X coordinate of the point
     */
    public void setX(int newX){
        this.x= newX;
    }
    /**
     *
     * @param newY the Y coordinate of the point
     */
    public void setY(int newY){
        this.y = newY;
    }

    /**
     *
     * See this infinite loop {@code while(true)}
     */


}
