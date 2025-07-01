import java.util.*;
public class BillCost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the price of pencil: ");
        float pencilCost = sc.nextFloat();
        System.err.print("Enter the price of pen: ");
        float penCost = sc.nextFloat();
        System.err.print("Enter the price of eraser: ");
        float eraserCost = sc.nextFloat();
        float Bill = pencilCost+penCost+eraserCost;
        System.out.println("Total bill: "+Bill);
        float gstBill = (Bill + (Bill*18)/100);//(Bill + (Bill*0.18f))
        System.out.println("Total bill with gst: "+gstBill);
        sc.close();
    }
    
}
