class Order {
    int orderId;
    String orderDate;
    Order(int id,String date){ orderId=id; orderDate=date; }
    String getOrderStatus(){ return "Order placed"; }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int id,String date,String tracking){
        super(id,date);
        this.trackingNumber=tracking;
    }
    @Override String getOrderStatus(){ return "Order shipped"; }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int id,String date,String tracking,String delivery){
        super(id,date,tracking);
        this.deliveryDate=delivery;
    }
    @Override String getOrderStatus(){ return "Order delivered on "+deliveryDate; }
}

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(1001,"2025-09-20","TRK123","2025-09-22");
        System.out.println(d.getOrderStatus());
    }
}
