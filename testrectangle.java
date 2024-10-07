public class testrectangle {
    public static void main(String[] args) {
        rectangle r1=new rectangle(1.2f,3.4f);
        System.out.println(r1);
        rectangle r2=new rectangle();
        System.out.println(r2);
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " +r1.getLength());
        System.out.println("width is: "+r1.getWidth());
        System.out.printf("area is: %.2f%n",r1.getArea());
        System.out.printf("perimater is: %.2f%n",r1.getperimeter());
    }
}
