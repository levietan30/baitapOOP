public class rectangle {
    private float length;
    private float width;
    public rectangle()
    {
        length=1.0f;
        width=1.0f;
    }
    public rectangle(float l, float w)
    {
        length=l;
        width=w;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float l)
    {
        length=l;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float w)
    {
        width=w;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getperimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle[length="+this.length+",width="+this.width+"]";
    }
}
