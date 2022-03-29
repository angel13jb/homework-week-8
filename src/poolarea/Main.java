package poolarea;

public class Main {
    //calling class in main method
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,10);
        System.out.println("rectangel.width="+rectangle.getWidth());
        System.out.println("rectangel.length="+rectangle.getLength());
        System.out.println("rectangel.area="+rectangle.getArea());
        Cuboid cuboid=new Cuboid(5,10,5);
        System.out.println("cuboid width="+cuboid.getWidth());
        System.out.println("cuboid length="+cuboid.getLength());
        System.out.println("cuboid area="+cuboid.getArea());
        System.out.println("cuboid height="+cuboid.getHeight());
        System.out.println("cuboid volume="+cuboid.getVolume());
    }
}
