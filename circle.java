public class circle {
    private double radius;
    private String color;
    public circle()
    {
        radius=1.0;
        color="red";
    }
    public circle(double r)
    {
        radius=r;
        color="red";
    }
    public double getradius()
    {
        return radius;
    }
    public double getarea()
    {
        return radius*radius*Math.PI;
    }
}
