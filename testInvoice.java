public class testInvoice {
    public static void main(String[] args) {
        invoiceitem in1=new invoiceitem("A101","Pen Red",888,0.08);
        System.out.println(in1);
        in1.setQty(999);
        in1.setUnitPrice(0.99);
        System.out.println(in1);
        System.out.println("id is: "+in1.getId());
        System.out.println("desc is: "+in1.getDesc());
        System.out.println("qty is: "+in1.getQty());
        System.out.println("unitPrice is: "+in1.getUnitPrice());
        System.out.println("The total is: "+in1.getTotal());
    }
}
