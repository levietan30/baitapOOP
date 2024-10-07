public class testcircle {
    public static void main(String[] args)
    {
        circle c1=new circle();
        System.out.println("The circle has radius of "+c1.getradius()+" and area of " + c1.getarea());
        circle c2=new circle(2.0);
        System.out.println("The circle has radius of "+c2.getradius()+" and area of "+c2.getarea());
    }
}
