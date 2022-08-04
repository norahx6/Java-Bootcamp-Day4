package Day4;

public class invoiceItem {

    public static void main(String[] args) {


        invoiceItem invoiceItem1 = new invoiceItem( "123456", "Norah",3,4);
        System.out.println(invoiceItem1.toString());


    }

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public invoiceItem(String id,String desc,int qty,double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public double Total(){
        return unitPrice * qty;
    }
    @Override
    public  String toString() {
        return "ID =" + " " + id + " " + "decs = " + desc + " qty= " +" "+ qty + " "+"unitPrice=" +" " + unitPrice;
    }

}
