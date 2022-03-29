public class Point {
//class with instance variable
    int x;
    int y;
//constructor with no parameters
    Point() {

    }
    //constructor with parameters and initialize value
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
//method 1 with return value
    public int getX() {
        return x;
    }
//method 2 with return value
    public int getY() {
        return y;
    }
//method 3 to set value
    public void setX(int x) {
        this.x = x;
    }
//method 4 to set value
    public void setY(int y) {
        this.y = y;
    }
//method calculate distance
    public double distance() {
        double dis;
        int x1 = x;
        int x2 = 0;
        int y1 = y;
        int y2 = 0;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;

    }
//method with parameter return value
    public double distance(int x, int y) {
        double dis;
        int x1 = this.x;
        int x2 = x;
        int y1 = this.y;
        int y2 = y;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;

    }
    //method with parameters
    public double distance(Point a) {
        double dis;
        int x1 = this.x;
        int x2 = a.x;
        int y1 = this.y;
        int y2 = a.y;
        dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return dis;
    }
//calling in main method via object
    public static void main(String[] args) {
        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println("distance(0,0)="+first.distance());
        System.out.println("distance(second)="+first.distance(second));
        System.out.println("distance(2,2)="+first.distance(2,2));
        Point point=new Point();
        System.out.println("distance()="+point.distance());
    }

}